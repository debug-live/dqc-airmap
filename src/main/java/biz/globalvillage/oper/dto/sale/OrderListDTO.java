package biz.globalvillage.oper.dto.sale;

import java.math.BigDecimal;
import java.util.Date;

public class OrderListDTO {
    //主键
    private Long orderId;
    //订单编号
    private String orderSn;
    //品牌商名称
    private String brandCompanyName;
    private long channelId;  //订单类型编号
    //物流公司
    private String logisticsName;
    //物流编号
    private String logisticsSn;
    //创建日期
    private Date createDate;
    //订单类型名称
    private String channelName;
    //订单类型code
    private String channelCode;
    //订单用户的姓名
    private String userName;
    //订单用户的电话
    private String phone;
    //数量
    private int quantity;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getBrandCompanyName() {
        return brandCompanyName;
    }

    public void setBrandCompanyName(String brandCompanyName) {
        this.brandCompanyName = brandCompanyName;
    }

    public long getChannelId() {
        return channelId;
    }

    public void setChannelId(long channelId) {
        this.channelId = channelId;
    }

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public String getLogisticsSn() {
        return logisticsSn;
    }

    public void setLogisticsSn(String logisticsSn) {
        this.logisticsSn = logisticsSn;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
