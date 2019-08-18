package cn.edu.zju.crm4learning.controller;

import cn.edu.zju.crm4learning.pojo.JSONBean;
import cn.edu.zju.crm4learning.pojo.TbCustomer;
import cn.edu.zju.crm4learning.pojo.TbOrder;
import cn.edu.zju.crm4learning.service.TbCustomerService;
import cn.edu.zju.crm4learning.service.TbOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * statistics Controller.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
@Controller
@RequestMapping("/statistics")
public class StatisticsController {

    @Autowired
    private TbOrderService tbOrderService;

    @Autowired
    private TbCustomerService tbCustomerService;

    /**
     * 今日统计
     * @param model model
     * @return statistics-today.jsp
     */
    @RequestMapping("/today")
    public String getStatisticsToday(Model model) {
        List<TbOrder> todayOrders = tbOrderService.getTodayOrders();
        model.addAttribute("todayOrders", todayOrders);
        return "statistics-today";
    }

    /**
     * 全部记录
     * @param model model
     * @return statistics-all.jsp
     */
    @RequestMapping("/all")
    public String getStatisticsAll(Model model) {
        // 将客户名称打包
        List<TbCustomer> customers = tbCustomerService.getCustomers();
        model.addAttribute("customers", customers);
        return "statistics-all";
    }

    /**
     * 点击编辑后, 更新改行和以下所有行
     * @param param ajax传来的参数
     */
    @RequestMapping(value = "/updateReceivables", method = RequestMethod.POST)
    @ResponseBody
    public void updateReceivables(@RequestBody JSONBean param) {
        ArrayList<TbOrder> orders = param.getData();

        for (int i = 0; i < orders.size(); i++) {
            TbOrder order = orders.get(i);
            tbOrderService.updateReceivables(order);
            if (i == orders.size() - 1) {
                tbCustomerService.updateCustomersReceivablesFromAjax(order);
            }
        }
    }

    /**
     * 搜索对应用户的账单
     * @param model model
     * @param tbCustomer 用户pojo
     * @return statistics-all.jsp
     */
    @RequestMapping("/searchOrders")
    public String getSearchOrders(Model model, TbCustomer tbCustomer) {
        List<TbOrder> searchOrders = tbOrderService.getSearchOrders(tbCustomer.getCustomerName());
        model.addAttribute("searchOrders", searchOrders);

        List<TbCustomer> customers = tbCustomerService.getCustomers();
        model.addAttribute("customers", customers);
        return "statistics-all";
    }

    /**
     * 收款后增加一行的处理
     * @param param ajax传来的参数
     * @return 重定向为之前搜索过的页面
     */
    @RequestMapping(value = "/addMoneyLine", method = RequestMethod.POST)
    public String addMoneyLine(@RequestBody JSONBean param) {
        ArrayList<TbOrder> orders = param.getData();
        TbOrder order = orders.get(0);
        tbOrderService.addMoneyLine(order);
        tbCustomerService.updateCustomerReceivables(order.getOrderCustomerName(), order.getShowEveryReceivables());
        return "redirect:/statistics/searchOrders?customerName=" + order.getOrderCustomerName();
    }
}
