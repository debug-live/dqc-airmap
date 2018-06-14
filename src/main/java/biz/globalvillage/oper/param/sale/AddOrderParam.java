package biz.globalvillage.oper.param.sale;

import org.springframework.web.multipart.MultipartFile;

public class AddOrderParam {
    //行业渠道
    private long channelId;
    //联系电话
    private long phone;
    //订单用户
    private String userName;
    //物流公司
    private String logisticsSn;
    //物流编号
    private String logisticsName;
    //订单编号
    private String orderSn;
    private MultipartFile excel;

    public long getChannelId() {
        return channelId;
    }

    public void setChannelId(long channelId) {
        this.channelId = channelId;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLogisticsSn() {
        return logisticsSn;
    }

    public void setLogisticsSn(String logisticsSn) {
        this.logisticsSn = logisticsSn;
    }

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public MultipartFile getExcel() {
        return excel;
    }

    public void setExcel(MultipartFile excel) {
        this.excel = excel;
    }
}
