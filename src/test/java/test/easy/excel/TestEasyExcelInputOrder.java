package test.easy.excel;

import cn.edu.zju.crm4learning.mapper.TbOrderMapper;
import cn.edu.zju.crm4learning.pojo.ExcelInputBean;
import cn.edu.zju.crm4learning.pojo.TbOrder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.base.BaseJunit4Test;

import java.io.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * .
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class TestEasyExcelInputOrder extends BaseJunit4Test {
    @Autowired
    private TbOrderMapper tbOrderMapper;

    @Test
    public void tsetEsayExcelInputOrder() {
        int count = 0;
        try (InputStream fis = new FileInputStream("F:\\Java_Project\\idea\\crm4learning\\src\\test\\java\\test.xlsx")) {
            List<ExcelInputBean> excelInputBeans = ExcelUtils.readExcel(fis, ExcelInputBean.class);
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
            e.printStackTrace();
        }

    }
}
