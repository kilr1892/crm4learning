package cn.edu.zju.crm4learning.controller;

import cn.edu.zju.crm4learning.pojo.Customer;
import cn.edu.zju.crm4learning.pojo.OrderId;
import cn.edu.zju.crm4learning.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 订单Controller.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;
    /**
     * 获取订单表页面
     * @param model model
     * @return 订单表页面
     */
    @RequestMapping("order")
    public String getOrder(Model model) {
        // 将客户名称打包
        List<Customer> customers = orderService.getCustomers();
        OrderId orderId = orderService.getOrderId();
        model.addAttribute("orderId", orderId);
        model.addAttribute("customers", customers);
        return "order";
    }


}
