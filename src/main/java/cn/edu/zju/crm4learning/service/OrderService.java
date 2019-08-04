package cn.edu.zju.crm4learning.service;

import cn.edu.zju.crm4learning.pojo.Customer;
import cn.edu.zju.crm4learning.pojo.OrderId;

import java.util.List;

/**
 * .
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public interface OrderService {

    List<Customer> getCustomers();

    OrderId getOrderId();
}
