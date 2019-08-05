package cn.edu.zju.crm4learning.controller;

import cn.edu.zju.crm4learning.pojo.TbCustomer;
import cn.edu.zju.crm4learning.service.TbCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 客户controller.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
@RequestMapping("/customer")
@Controller
public class TbCustomerController {

    @Autowired
    private TbCustomerService tbCustomerService;

    /**
     * produces = "application/json; charset=utf-8"  和ajax的 contentType: 'application/json',
     * 是返回中文不乱码的关键
     */
    @RequestMapping(value = "/getCustomerPhone", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getCustomerPhone(@RequestParam(value = "customerName") String customerName) {
        String customerPhone = tbCustomerService.getCustomerPhone(customerName);
        return customerPhone;
    }

    @RequestMapping("/getCustomers")
    @ResponseBody
    public List<TbCustomer> getCustomers() {
        return tbCustomerService.getCustomers();
    }
}

