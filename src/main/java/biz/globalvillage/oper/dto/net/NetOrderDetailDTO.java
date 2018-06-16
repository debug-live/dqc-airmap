package biz.globalvillage.oper.dto.net;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.globalvillage.bg.common.enums.net.NetOrderStatusEnum;
import com.globalvillage.bg.common.enums.order.MallOrderStatusEnum;
import com.globalvillage.bg.common.enums.pay.MallPayChannelEnum;

import java.time.LocalDateTime;
import java.util.List;

public class NetOrderDetailDTO {

    private String orderId;

    private String orderCode;

    private String orderStatusName;

    private String paymentTypeName;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private LocalDateTime paymentTime;

    private String expressCode;

    private String expressCompany;

    private String deliveryName;

    private String deliveryPhone;

    private String deliveryAddress;

    private String goodsTotalPrice;

    private List<NetOrderGoodsDTO> goodsList;

    //辅助字段
    private int orderStatus;

    private int paymentType;


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

    public String getOrderStatusName() {
        if(orderStatus>= MallOrderStatusEnum.HAS_PAY.getValue()
                && orderStatus<=MallOrderStatusEnum.HAS_COMPLETE.getValue()){
            return NetOrderStatusEnum.PAYED.getName();
        }else if(orderStatus>= MallOrderStatusEnum.WAIT_REFUND.getValue()
                && orderStatus<=MallOrderStatusEnum.HAS_RETURNED.getValue()){
            return NetOrderStatusEnum.REFUND.getName();
        }else {
            return orderStatusName;
        }
    }

    public void setOrderStatusName(String orderStatusName) {
        this.orderStatusName = orderStatusName;
    }

    public String getPaymentTypeName() {
        return MallPayChannelEnum.getNameByValue(paymentType);
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryPhone() {
        return deliveryPhone;
    }

    public void setDeliveryPhone(String deliveryPhone) {
        this.deliveryPhone = deliveryPhone;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public List<NetOrderGoodsDTO> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<NetOrderGoodsDTO> goodsList) {
        this.goodsList = goodsList;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public String getGoodsTotalPrice() {
        return goodsTotalPrice;
    }

    public void setGoodsTotalPrice(String goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }
}
