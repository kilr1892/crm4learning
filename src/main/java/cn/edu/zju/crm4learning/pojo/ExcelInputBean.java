package cn.edu.zju.crm4learning.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

/**
 * .
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class ExcelInputBean extends BaseRowModel {

    /** 订单生成日期 */
    @ExcelProperty(index = 0, value = "日期", format = "yyyy/MM/dd")
    private Date orderDate;

    /** 客户名称 */
    @ExcelProperty(index = 1, value = "客户名称")
    private String orderCustomerName;

    /** 材料名称 */
    @ExcelProperty(index = 2, value = "材料名称")
    private String orderMaterialName;

    /** 颜色 */
    @ExcelProperty(index = 3, value = "颜色")
    private String orderMaterialColor;

    /** 规格 */
    @ExcelProperty(index = 5, value = "规格")
    private String orderMaterialSpecifications;

    /** 重量 */
    @ExcelProperty(index = 6, value = "重量")
    private String orderMaterialWeight;

    /** 单价 */
    @ExcelProperty(index = 7, value = "单价")
    private String orderPrice;

    /** 销售金额 */
    @ExcelProperty(index = 8, value = "销售金额")
    private String orderTotalPrice;

    /** 切割工 */
    @ExcelProperty(index = 9, value = "切割工")
    private String orderCuttingWage;

    /** 税点 */
    @ExcelProperty(index = 10, value = "税点")
    private String orderTaxPoint;

    /** 冲帐 */
    @ExcelProperty(index = 11, value = "冲帐")
    private String orderStrike;

    /** 进项金额 */
    @ExcelProperty(index = 12, value = "进项金额")
    private String paymentInputMoney;

    /** 应收款 */
    @ExcelProperty(index = 13, value = "应收款")
    private String showEveryReceivables;

    /** 收款方式 */
    @ExcelProperty(index = 14, value = "收款方式")
    private String paymentMethod;

    /** 备注 */
    @ExcelProperty(index = 15, value = "备注")
    private String paymentRemarks;

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderCustomerName() {
        return orderCustomerName;
    }

    public void setOrderCustomerName(String orderCustomerName) {
        this.orderCustomerName = orderCustomerName;
    }

    public String getOrderMaterialName() {
        return orderMaterialName;
    }

    public void setOrderMaterialName(String orderMaterialName) {
        this.orderMaterialName = orderMaterialName;
    }

    public String getOrderMaterialColor() {
        return orderMaterialColor;
    }

    public void setOrderMaterialColor(String orderMaterialColor) {
        this.orderMaterialColor = orderMaterialColor;
    }

    public String getOrderMaterialSpecifications() {
        return orderMaterialSpecifications;
    }

    public void setOrderMaterialSpecifications(String orderMaterialSpecifications) {
        this.orderMaterialSpecifications = orderMaterialSpecifications;
    }

    public String getOrderMaterialWeight() {
        return StringUtils.isEmpty(orderMaterialWeight) ? "0" : orderMaterialWeight;
    }

    public void setOrderMaterialWeight(String orderMaterialWeight) {
        this.orderMaterialWeight = orderMaterialWeight;
    }

    public String getOrderPrice() {
        return StringUtils.isEmpty(orderPrice) ? "0" : orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderTotalPrice() {
        return StringUtils.isEmpty(orderTotalPrice) ? "0" : orderTotalPrice;
    }

    public void setOrderTotalPrice(String orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public String getOrderCuttingWage() {
        return StringUtils.isEmpty(orderCuttingWage) ? "0" : orderCuttingWage;
    }

    public void setOrderCuttingWage(String orderCuttingWage) {
        this.orderCuttingWage = orderCuttingWage;
    }

    public String getOrderTaxPoint() {
        return StringUtils.isEmpty(orderTaxPoint) ? "0" : orderTaxPoint;
    }

    public void setOrderTaxPoint(String orderTaxPoint) {
        this.orderTaxPoint = orderTaxPoint;
    }

    public String getOrderStrike() {
        return StringUtils.isEmpty(orderStrike) ? "0" : orderStrike;
    }

    public void setOrderStrike(String orderStrike) {
        this.orderStrike = orderStrike;
    }

    public String getPaymentInputMoney() {
        return StringUtils.isEmpty(paymentInputMoney) ? "0" : paymentInputMoney;
    }

    public void setPaymentInputMoney(String paymentInputMoney) {
        this.paymentInputMoney = paymentInputMoney;
    }

    public String getShowEveryReceivables() {
        return StringUtils.isEmpty(showEveryReceivables) ? "0" : showEveryReceivables;
    }

    public void setShowEveryReceivables(String showEveryReceivables) {
        this.showEveryReceivables = showEveryReceivables;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentRemarks() {
        return paymentRemarks;
    }

    public void setPaymentRemarks(String paymentRemarks) {
        this.paymentRemarks = paymentRemarks;
    }
}
