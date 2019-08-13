package cn.edu.zju.crm4learning.pojo;

import java.math.BigDecimal;

public class TbCustomer {
    private Integer customerId;

    private String customerName;

    private String customerPhone;

    private String customerRemarks;

    private BigDecimal customerReceivables;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public String getCustomerRemarks() {
        return customerRemarks;
    }

    public void setCustomerRemarks(String customerRemarks) {
        this.customerRemarks = customerRemarks == null ? null : customerRemarks.trim();
    }

    public BigDecimal getCustomerReceivables() {
        return customerReceivables;
    }

    public void setCustomerReceivables(BigDecimal customerReceivables) {
        this.customerReceivables = customerReceivables;
    }
}