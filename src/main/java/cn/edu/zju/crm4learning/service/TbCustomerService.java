package cn.edu.zju.crm4learning.service;

import cn.edu.zju.crm4learning.pojo.TbCustomer;
import cn.edu.zju.crm4learning.pojo.TbOrder;

import java.math.BigDecimal;
import java.util.List;

/**
 * 客户表接口.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public interface TbCustomerService {

    List<TbCustomer> getCustomers();

    String getCustomerPhone(String customerName);

    BigDecimal selectCustomerReceivables(String customerName);

    void updateCustomerReceivables(String orderCustomerName, BigDecimal showEveryReceivables);

    void updateCustomersReceivablesFromAjax(TbOrder order);
}
