package cn.edu.zju.crm4learning.pojo;

import java.util.Date;

public class TbPayment {
    private String paymentOrderId;

    private Date paymentDate;

    private String paymentCuttingWage;

    private String paymentTaxPoint;

    private String paymentStrike;

    private String paymentInputMoney;

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

    public String getPaymentCuttingWage() {
        return paymentCuttingWage;
    }

    public void setPaymentCuttingWage(String paymentCuttingWage) {
        this.paymentCuttingWage = paymentCuttingWage == null ? null : paymentCuttingWage.trim();
    }

    public String getPaymentTaxPoint() {
        return paymentTaxPoint;
    }

    public void setPaymentTaxPoint(String paymentTaxPoint) {
        this.paymentTaxPoint = paymentTaxPoint == null ? null : paymentTaxPoint.trim();
    }

    public String getPaymentStrike() {
        return paymentStrike;
    }

    public void setPaymentStrike(String paymentStrike) {
        this.paymentStrike = paymentStrike == null ? null : paymentStrike.trim();
    }

    public String getPaymentInputMoney() {
        return paymentInputMoney;
    }

    public void setPaymentInputMoney(String paymentInputMoney) {
        this.paymentInputMoney = paymentInputMoney == null ? null : paymentInputMoney.trim();
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod == null ? null : paymentMethod.trim();
    }
}