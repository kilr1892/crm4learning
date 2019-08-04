package cn.edu.zju.crm4learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("statistics-today")
    public String getStatisticsToday(Model model) {
        return "statistics-today";
    }

    @RequestMapping("statistics-all")
    public String getStatisticsAll(Model model) {
        return "statistics-all";
    }
}
