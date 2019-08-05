package cn.edu.zju.crm4learning.controller;

import cn.edu.zju.crm4learning.pojo.TbCustomer;
import cn.edu.zju.crm4learning.pojo.TbOrder;
import cn.edu.zju.crm4learning.pojo.TbOrderId;
import cn.edu.zju.crm4learning.service.TbOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
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
public class TbOrderController {

    @Autowired
    private TbOrderService tbOrderService;
    /**
     * 获取订单表页面
     * @param model model
     * @return 订单表页面
     */
    @RequestMapping("/order")
    public String getOrder(Model model) {
        // 将客户名称打包
        List<TbCustomer> customers = tbOrderService.getCustomers();
        TbOrderId orderId = tbOrderService.getOrderId();
        model.addAttribute("orderId", orderId);
        model.addAttribute("customers", customers);
        return "order";
    }

    @RequestMapping(value = "/order/add", method = RequestMethod.POST)
    @ResponseBody
    public void addOrder(TbOrder paramTbOrder, HttpServletRequest request) throws CloneNotSupportedException {

        for (int i = 0; i < 8; i++){
            String orderMaterialName = "orderMaterialName" + i;
            String orderMaterialNameValue = request.getParameter(orderMaterialName);
            if (orderMaterialNameValue == null || "".equals(orderMaterialNameValue)) {

            } else {
                // 克隆这步真的要吗?
                TbOrder tbOrder = (TbOrder) paramTbOrder.clone();
                tbOrder.setOrderMaterialName(orderMaterialNameValue);
                tbOrder.setOrderMaterialSpecifications(request.getParameter("orderMaterialSpecifications" + i));
                tbOrder.setOrderMaterialColor(request.getParameter("orderMaterialColor" + i));
                tbOrder.setOrderMaterialMeter(request.getParameter("orderMaterialMeter" + i));

                String strOrderMaterialWeight = request.getParameter("orderMaterialWeight" + i);
                tbOrder.setOrderMaterialWeight(strOrderMaterialWeight);
                BigDecimal orderMaterialWeight = new BigDecimal(strOrderMaterialWeight);

                tbOrder.setOrderMaterialCorona(request.getParameter("orderMaterialCorona" + i));
                tbOrder.setOrderMaterialFoldingMouth(request.getParameter("orderMaterialFoldingMouth" + i));

                String strOrderPrice = request.getParameter("orderPrice" + i);
                tbOrder.setOrderPrice(strOrderPrice);
                BigDecimal orderPrice = new BigDecimal(strOrderPrice);

                tbOrder.setOrderTotalPrice(orderPrice.multiply(orderMaterialWeight).toString());

                // 插入数据库
                tbOrderService.addOrder(tbOrder);
            }

        }
    }

}
