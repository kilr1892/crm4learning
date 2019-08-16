package cn.edu.zju.crm4learning.controller;

import cn.edu.zju.crm4learning.pojo.JSONBean;
import cn.edu.zju.crm4learning.pojo.TbOrder;
import cn.edu.zju.crm4learning.service.TbOrderService;
import com.fasterxml.jackson.databind.json.JsonMapper;
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
 * 每日统计Controller.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
@Controller
public class StatisticsController {

    @Autowired
    private TbOrderService tbOrderService;

    @RequestMapping("statistics-today")
    public String getStatisticsToday(Model model) {
        List<TbOrder> todayOrders = tbOrderService.getTodayOrders();
        model.addAttribute("todayOrders", todayOrders);
        return "statistics-today";
    }

    @RequestMapping("statistics-all")
    public String getStatisticsAll(Model model) {
        List<TbOrder> searchOrders = tbOrderService.getAllOrders();
        model.addAttribute("searchOrders", searchOrders);
        return "statistics-all";
    }

    @RequestMapping(value = "/statistics/updateReceivables", method = RequestMethod.POST)
    @ResponseBody
    public void updateReceivables(@RequestBody JSONBean param) {
        ArrayList<TbOrder> orders = param.getData();

        for (TbOrder order : orders) {
            tbOrderService.updateReceivables(order);
        }
//        return "ok";
    }
}
