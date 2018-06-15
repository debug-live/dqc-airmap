package biz.globalvillage.oper.dto.net;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class NetOrderListDTO {

    private String orderId;

    private String orderCode;

    private double goodsTotalPrice;

    private String deliveryPhone;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private LocalDateTime paymentTime;

    private long netId;

    private String netName;

    private String cityName;

    private String contactPhone;

    private String orderStatusName;

    //辅助字段
    private int orderStatus;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public double getGoodsTotalPrice() {
        return goodsTotalPrice;
    }

    public void setGoodsTotalPrice(double goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }

    public String getDeliveryPhone() {
        return deliveryPhone;
    }

    public void setDeliveryPhone(String deliveryPhone) {
        this.deliveryPhone = deliveryPhone;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getNetName() {
        return netName;
    }

    public void setNetName(String netName) {
        this.netName = netName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getOrderStatusName() {
//        if(orderStatus>= MallOrderStatusEnum.HAS_PAY.getValue()
//                && orderStatus<=MallOrderStatusEnum.HAS_COMPLETE.getValue()){
//            return NetOrderStatusEnum.PAYED.getName();
//        }else if(orderStatus>= MallOrderStatusEnum.WAIT_REFUND.getValue()
//                && orderStatus<=MallOrderStatusEnum.HAS_RETURNED.getValue()){
//            return NetOrderStatusEnum.REFUND.getName();
//        }else {
//            return orderStatusName;
//        }
        return orderStatusName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public long getNetId() {
        return netId;
    }

    public void setNetId(long netId) {
        this.netId = netId;
    }

    public void setOrderStatusName(String orderStatusName) {
        this.orderStatusName = orderStatusName;
    }
}
