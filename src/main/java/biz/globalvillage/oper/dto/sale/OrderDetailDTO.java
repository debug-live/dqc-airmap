package biz.globalvillage.oper.dto.sale;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderDetailDTO {
    //订单编号
    private String orderSn;
    //物流编号
    private String logisticsSn;
    //创建日期
    private Date createDate;
    //品牌商名称
    private String brandCompanyName;
    private long channelId;  //订单类型编号
    //物流公司
    private String logisticsName;
    //订单类型名称
    private String channelName;
    //用户名
    private String userName;
    //用户联系方式
    private String phone;
    //数量
    private int quantity;
    //设备详情，设备列表
    private List<DeviceListDTO> deviceList;

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
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

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
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

    public List<DeviceListDTO> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(List<DeviceListDTO> deviceList) {
        this.deviceList = deviceList;
    }
}
