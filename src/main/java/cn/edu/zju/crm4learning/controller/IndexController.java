package cn.edu.zju.crm4learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页controller.
 * <p>
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    private String showIndex(Model model) {
        return "index";
    }
}
