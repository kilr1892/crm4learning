package cn.edu.zju.crm4learning.service.impl;

import cn.edu.zju.crm4learning.mapper.TbCustomerMapper;
import cn.edu.zju.crm4learning.pojo.TbCustomer;
import cn.edu.zju.crm4learning.pojo.TbCustomerExample;
import cn.edu.zju.crm4learning.service.TbCustomerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * 订单表实现类.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
@Service
public class TbCustomerServiceImpl implements TbCustomerService {

    @Autowired
    private TbCustomerMapper tbCustomerMapper;

    @Override
    public List<TbCustomer> getCustomers() {
        TbCustomerExample customerExample = new TbCustomerExample();
        TbCustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andCustomerIdIsNotNull();
        List<TbCustomer> customers = tbCustomerMapper.selectByExample(customerExample);
        return customers;
    }

    @Override
    public String getCustomerPhone(String customerName) {
        TbCustomerExample customerExample = new TbCustomerExample();
        TbCustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andCustomerNameEqualTo(customerName);
        List<TbCustomer> customers = tbCustomerMapper.selectByExample(customerExample);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String customersJson = objectMapper.writeValueAsString(customers);
            return customersJson;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public BigDecimal selectCustomerReceivables(String customerName) {
        TbCustomerExample tbCustomerExample = new TbCustomerExample();
        TbCustomerExample.Criteria criteria = tbCustomerExample.createCriteria();
        criteria.andCustomerNameEqualTo(customerName);
        List<TbCustomer> tbCustomers = tbCustomerMapper.selectByExample(tbCustomerExample);
        TbCustomer tbCustomer = tbCustomers.get(0);
        if (tbCustomer == null) {
            return BigDecimal.valueOf(0);
        }
        BigDecimal customerReceivables = tbCustomer.getCustomerReceivables();
        return customerReceivables;
    }

    @Override
    public void updateCustomerReceivables(String orderCustomerName,BigDecimal showEveryReceivables) {
        TbCustomerExample tbCustomerExample = new TbCustomerExample();
        TbCustomerExample.Criteria criteria = tbCustomerExample.createCriteria();
        criteria.andCustomerNameEqualTo(orderCustomerName);

        TbCustomer record = new TbCustomer();
        record.setCustomerReceivables(showEveryReceivables);
        tbCustomerMapper.updateByExampleSelective(record, tbCustomerExample);
    }

}
