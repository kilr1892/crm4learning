package cn.edu.zju.crm4learning.service.impl;

import cn.edu.zju.crm4learning.mapper.TbOrderMapper;
import cn.edu.zju.crm4learning.pojo.ExcelInputBean;
import cn.edu.zju.crm4learning.pojo.TbOrder;
import cn.edu.zju.crm4learning.service.ExcelService;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
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
public class ExcelServiceImpl implements ExcelService {
    @Autowired
    private TbOrderMapper tbOrderMapper;

    @Override
    public int excel2Database(List<ExcelInputBean> excelInputBeans) {
        int count = 0;
        try {
            for (ExcelInputBean excel : excelInputBeans) {
                TbOrder tbOrder = new TbOrder();
                tbOrder.setOrderDate(excel.getOrderDate());
                tbOrder.setOrderCustomerName(excel.getOrderCustomerName());
                tbOrder.setOrderMaterialName(excel.getOrderMaterialName());
                tbOrder.setOrderMaterialColor(excel.getOrderMaterialColor());
                tbOrder.setOrderMaterialSpecifications(excel.getOrderMaterialSpecifications());
                tbOrder.setOrderMaterialWeight(new BigDecimal(excel.getOrderMaterialWeight()));
                tbOrder.setOrderPrice(new BigDecimal(excel.getOrderPrice()));
                tbOrder.setOrderTotalPrice(new BigDecimal(excel.getOrderTotalPrice()));
                tbOrder.setOrderCuttingWage(new BigDecimal(excel.getOrderCuttingWage()));
                tbOrder.setOrderTaxPoint(new BigDecimal(excel.getOrderTaxPoint()));
                tbOrder.setOrderStrike(new BigDecimal(excel.getOrderStrike()));
                tbOrder.setPaymentInputMoney(new BigDecimal(excel.getPaymentInputMoney()));
                tbOrder.setShowEveryReceivables(new BigDecimal(excel.getShowEveryReceivables()));
                tbOrder.setPaymentMethod(excel.getPaymentMethod());
                tbOrder.setPaymentRemarks(excel.getPaymentRemarks());

                tbOrderMapper.insertSelective(tbOrder);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
        return count;
    }
}
