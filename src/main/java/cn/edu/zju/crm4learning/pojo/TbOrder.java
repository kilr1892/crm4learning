package cn.edu.zju.crm4learning.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TbOrder implements Cloneable{
    private String orderId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDate;

    private String orderCustomerId;

    private String orderCustomerName;

    private String orderCustomerPhone;

    private String orderCustomerAddress;

    private String orderMaterialName;

    private String orderMaterialColor;

    private String orderMaterialSpecifications;

    private String orderMaterialMeter;

    private String orderMaterialWeight;

    private String orderMaterialCorona;

    private String orderMaterialFoldingMouth;

    private String orderPrice;

    private String orderTotalPrice;

    private String orderRemarks;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
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

    public String getOrderMaterialWeight() {
        return orderMaterialWeight;
    }

    public void setOrderMaterialWeight(String orderMaterialWeight) {
        this.orderMaterialWeight = orderMaterialWeight == null ? null : orderMaterialWeight.trim();
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

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice == null ? null : orderPrice.trim();
    }

    public String getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(String orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice == null ? null : orderTotalPrice.trim();
    }

    public String getOrderRemarks() {
        return orderRemarks;
    }

    public void setOrderRemarks(String orderRemarks) {
        this.orderRemarks = orderRemarks == null ? null : orderRemarks.trim();
    }
}