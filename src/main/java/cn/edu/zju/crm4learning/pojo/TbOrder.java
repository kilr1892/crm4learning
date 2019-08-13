package cn.edu.zju.crm4learning.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class TbOrder implements Cloneable {
    private Integer primaryKeyForOrder;

    private String orderId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDeliveryDate;

    private String orderCustomerId;

    private String orderCustomerName;

    private String orderCustomerPhone;

    private String orderCustomerAddress;

    private String orderMaterialName;

    private String orderMaterialColor;

    private String orderMaterialSpecifications;

    private String orderMaterialMeter;

    private BigDecimal orderMaterialWeight;

    private String orderMaterialCorona;

    private String orderMaterialFoldingMouth;

    private BigDecimal orderPrice;

    private BigDecimal orderTotalPrice;

    private String orderRemarks;

    private BigDecimal orderCuttingWage;

    private BigDecimal orderTaxPoint;

    private BigDecimal orderStrike;

    private BigDecimal paymentInputMoney;

    private BigDecimal showEveryReceivables;

    private String paymentMethod;

    private String paymentRemarks;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Integer getPrimaryKeyForOrder() {
        return primaryKeyForOrder;
    }

    public void setPrimaryKeyForOrder(Integer primaryKeyForOrder) {
        this.primaryKeyForOrder = primaryKeyForOrder;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getOrderDeliveryDate() {
        return orderDeliveryDate;
    }

    public void setOrderDeliveryDate(Date orderDeliveryDate) {
        this.orderDeliveryDate = orderDeliveryDate;
    }

    public String getOrderCustomerId() {
        return orderCustomerId;
    }

    public void setOrderCustomerId(String orderCustomerId) {
        this.orderCustomerId = orderCustomerId == null ? null : orderCustomerId.trim();
    }

    public String getOrderCustomerName() {
        return orderCustomerName;
    }

    public void setOrderCustomerName(String orderCustomerName) {
        this.orderCustomerName = orderCustomerName == null ? null : orderCustomerName.trim();
    }

    public String getOrderCustomerPhone() {
        return orderCustomerPhone;
    }

    public void setOrderCustomerPhone(String orderCustomerPhone) {
        this.orderCustomerPhone = orderCustomerPhone == null ? null : orderCustomerPhone.trim();
    }

    public String getOrderCustomerAddress() {
        return orderCustomerAddress;
    }

    public void setOrderCustomerAddress(String orderCustomerAddress) {
        this.orderCustomerAddress = orderCustomerAddress == null ? null : orderCustomerAddress.trim();
    }

    public String getOrderMaterialName() {
        return orderMaterialName;
    }

    public void setOrderMaterialName(String orderMaterialName) {
        this.orderMaterialName = orderMaterialName == null ? null : orderMaterialName.trim();
    }

    public String getOrderMaterialColor() {
        return orderMaterialColor;
    }

    public void setOrderMaterialColor(String orderMaterialColor) {
        this.orderMaterialColor = orderMaterialColor == null ? null : orderMaterialColor.trim();
    }

    public String getOrderMaterialSpecifications() {
        return orderMaterialSpecifications;
    }

    public void setOrderMaterialSpecifications(String orderMaterialSpecifications) {
        this.orderMaterialSpecifications = orderMaterialSpecifications == null ? null : orderMaterialSpecifications.trim();
    }

    public String getOrderMaterialMeter() {
        return orderMaterialMeter;
    }

    public void setOrderMaterialMeter(String orderMaterialMeter) {
        this.orderMaterialMeter = orderMaterialMeter == null ? null : orderMaterialMeter.trim();
    }

    public BigDecimal getOrderMaterialWeight() {
        return orderMaterialWeight;
    }

    public void setOrderMaterialWeight(BigDecimal orderMaterialWeight) {
        this.orderMaterialWeight = orderMaterialWeight;
    }

    public String getOrderMaterialCorona() {
        return orderMaterialCorona;
    }

    public void setOrderMaterialCorona(String orderMaterialCorona) {
        this.orderMaterialCorona = orderMaterialCorona == null ? null : orderMaterialCorona.trim();
    }

    public String getOrderMaterialFoldingMouth() {
        return orderMaterialFoldingMouth;
    }

    public void setOrderMaterialFoldingMouth(String orderMaterialFoldingMouth) {
        this.orderMaterialFoldingMouth = orderMaterialFoldingMouth == null ? null : orderMaterialFoldingMouth.trim();
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(BigDecimal orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public String getOrderRemarks() {
        return orderRemarks;
    }

    public void setOrderRemarks(String orderRemarks) {
        this.orderRemarks = orderRemarks == null ? null : orderRemarks.trim();
    }

    public BigDecimal getOrderCuttingWage() {
        return orderCuttingWage;
    }

    public void setOrderCuttingWage(BigDecimal orderCuttingWage) {
        this.orderCuttingWage = orderCuttingWage;
    }

    public BigDecimal getOrderTaxPoint() {
        return orderTaxPoint;
    }

    public void setOrderTaxPoint(BigDecimal orderTaxPoint) {
        this.orderTaxPoint = orderTaxPoint;
    }

    public BigDecimal getOrderStrike() {
        return orderStrike;
    }

    public void setOrderStrike(BigDecimal orderStrike) {
        this.orderStrike = orderStrike;
    }

    public BigDecimal getPaymentInputMoney() {
        return paymentInputMoney;
    }

    public void setPaymentInputMoney(BigDecimal paymentInputMoney) {
        this.paymentInputMoney = paymentInputMoney;
    }

    public BigDecimal getShowEveryReceivables() {
        return showEveryReceivables;
    }

    public void setShowEveryReceivables(BigDecimal showEveryReceivables) {
        this.showEveryReceivables = showEveryReceivables;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod == null ? null : paymentMethod.trim();
    }

    public String getPaymentRemarks() {
        return paymentRemarks;
    }

    public void setPaymentRemarks(String paymentRemarks) {
        this.paymentRemarks = paymentRemarks == null ? null : paymentRemarks.trim();
    }
}