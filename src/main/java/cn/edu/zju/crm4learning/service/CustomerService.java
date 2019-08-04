package cn.edu.zju.crm4learning.service;

import cn.edu.zju.crm4learning.pojo.Customer;

import java.util.List;

/**
 * 客户表接口.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public interface CustomerService {

    List<Customer> getCustomers();

    String getCustomerPhone(String customerName);
    
}
