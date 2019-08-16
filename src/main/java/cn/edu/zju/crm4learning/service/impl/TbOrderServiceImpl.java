package cn.edu.zju.crm4learning.service.impl;

import cn.edu.zju.crm4learning.mapper.TbCustomerMapper;
import cn.edu.zju.crm4learning.mapper.TbOrderMapper;
import cn.edu.zju.crm4learning.pojo.*;
import cn.edu.zju.crm4learning.service.TbOrderService;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * .
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
@Service
public class TbOrderServiceImpl implements TbOrderService {
    @Autowired
    private TbOrderMapper tbOrderMapper;

    @Autowired
    private TbCustomerMapper tbCustomerMapper;

    @Override
    public TbOrderId getOrderId() {
        LocalDate now = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyyMMdd");
        String orderDay = fmt.print(now);

        // 数据库查数据
        String lastOrderId = tbOrderMapper.selectLastOrderNumber(orderDay + "__");
        // 如果没查到
        if (lastOrderId == null) {
            String orderNum = "01";
            String orderId = orderDay + orderNum;
            return new TbOrderId(orderDay, orderNum, orderId);
        } else {
            String lastOrderNum = lastOrderId.substring(8);
            int intOrderNum = Integer.parseInt(lastOrderNum) + 1;
            String orderNum = String.format("%02d", intOrderNum);
            String orderId = orderDay + orderNum;
            return new TbOrderId(orderDay, orderNum, orderId);
        }
    }

    @Override
    public void addOrder(TbOrder tbOrder) {
        tbOrderMapper.insertSelective(tbOrder);
    }

    @Override
    public List<TbOrder> getTodayOrders() {
        TbOrderExample tbOrderExample = new TbOrderExample();
        TbOrderExample.Criteria criteria = tbOrderExample.createCriteria();
        criteria.andOrderDateEqualTo(new Date());

        List<TbOrder> tbOrders = tbOrderMapper.selectByExample(tbOrderExample);
        return tbOrders;
    }

    @Override
    public List<TbOrder> getAllOrders() {
        TbOrderExample tbOrderExample = new TbOrderExample();
        List<TbOrder> tbOrders = tbOrderMapper.selectByExample(tbOrderExample);
        return tbOrders;
    }

    @Override
    public void updateReceivables(TbOrder order) {
        tbOrderMapper.updateByPrimaryKeySelective(order);

        BigDecimal showEveryReceivables = order.getShowEveryReceivables();
        TbCustomer tbCustomer = new TbCustomer();
        tbCustomer.setCustomerReceivables(showEveryReceivables);

        TbCustomerExample tbCustomerExample = new TbCustomerExample();
        TbCustomerExample.Criteria criteria = tbCustomerExample.createCriteria();
        criteria.andCustomerNameEqualTo(order.getOrderCustomerName());
        tbCustomerMapper.updateByExampleSelective(tbCustomer, tbCustomerExample);

    }
}
