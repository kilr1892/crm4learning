package cn.edu.zju.crm4learning.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Payment {
    private String paymentOrderId;

    private Date paymentDate;

    private BigDecimal paymentCuttingWage;

    private BigDecimal paymentTaxPoint;

    private BigDecimal paymentStrike;

    private BigDecimal paymentInputMoney;

    private String paymentMethod;

    public String getPaymentOrderId() {
        return paymentOrderId;
    }

    public void setPaymentOrderId(String paymentOrderId) {
        this.paymentOrderId = paymentOrderId == null ? null : paymentOrderId.trim();
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getPaymentCuttingWage() {
        return paymentCuttingWage;
    }

    public void setPaymentCuttingWage(BigDecimal paymentCuttingWage) {
        this.paymentCuttingWage = paymentCuttingWage;
    }

    public BigDecimal getPaymentTaxPoint() {
        return paymentTaxPoint;
    }

    public void setPaymentTaxPoint(BigDecimal paymentTaxPoint) {
        this.paymentTaxPoint = paymentTaxPoint;
    }

    public BigDecimal getPaymentStrike() {
        return paymentStrike;
    }

    public void setPaymentStrike(BigDecimal paymentStrike) {
        this.paymentStrike = paymentStrike;
    }

    public BigDecimal getPaymentInputMoney() {
        return paymentInputMoney;
    }

    public void setPaymentInputMoney(BigDecimal paymentInputMoney) {
        this.paymentInputMoney = paymentInputMoney;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod == null ? null : paymentMethod.trim();
    }
}