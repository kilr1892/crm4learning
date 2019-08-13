package cn.edu.zju.crm4learning.pojo;

/**
 * .
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class TbOrderId {

    private String orderDay;
    private String orderNum;
    private String orderId;

    public TbOrderId() {
    }

    public TbOrderId(String orderDay, String orderNum, String orderId) {
        this.orderDay = orderDay;
        this.orderNum = orderNum;
        this.orderId = orderId;
    }

    public String getOrderDay() {
        return orderDay;
    }

    public void setOrderDay(String orderDay) {
        this.orderDay = orderDay;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}

