package cn.edu.zju.crm4learning.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private String orderId;

    private Date orderDate;

    private String orderCustomerId;

    private String orderCustomerName;

    private String orderMaterialName;

    private String orderMaterialClolr;

    private String orderMaterialSpecifications;

    private Double orderMaterialWeight;

    private BigDecimal orderPrice;

    private BigDecimal orderTotalPrice;

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

    public String getOrderMaterialName() {
        return orderMaterialName;
    }

    public void setOrderMaterialName(String orderMaterialName) {
        this.orderMaterialName = orderMaterialName == null ? null : orderMaterialName.trim();
    }

    public String getOrderMaterialClolr() {
        return orderMaterialClolr;
    }

    public void setOrderMaterialClolr(String orderMaterialClolr) {
        this.orderMaterialClolr = orderMaterialClolr == null ? null : orderMaterialClolr.trim();
    }

    public String getOrderMaterialSpecifications() {
        return orderMaterialSpecifications;
    }

    public void setOrderMaterialSpecifications(String orderMaterialSpecifications) {
        this.orderMaterialSpecifications = orderMaterialSpecifications == null ? null : orderMaterialSpecifications.trim();
    }

    public Double getOrderMaterialWeight() {
        return orderMaterialWeight;
    }

    public void setOrderMaterialWeight(Double orderMaterialWeight) {
        this.orderMaterialWeight = orderMaterialWeight;
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
}