package cn.edu.zju.crm4learning.service;

import cn.edu.zju.crm4learning.pojo.TbOrder;
import cn.edu.zju.crm4learning.pojo.TbOrderId;

import java.util.List;

/**
 * .
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public interface TbOrderService {

//    List<TbCustomer> getCustomers();

    TbOrderId getOrderId();

    void addOrder(TbOrder tbOrder);

    List<TbOrder> getTodayOrders();

    List<TbOrder> getAllOrders();

    void updateReceivables(TbOrder order);

    List<TbOrder> getSearchOrders(String customerName);

    void addMoneyLine(TbOrder order);
}
