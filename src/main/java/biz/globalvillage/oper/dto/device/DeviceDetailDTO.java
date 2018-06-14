package biz.globalvillage.oper.dto.device;

import java.util.List;

public class DeviceDetailDTO {

    private Long deviceId;  //主键

    private String categoryName;

    private String modelName;

    private String sn;  //设备序列号

    private String iccid;

    private String channelName;

    private String appUserPhone;

    private String deviceStatus;

    private String fullAdderss;  //设备所在地址

    private String dealerName;

    private List<DeviceStrainerListDTO> strainerList;

    //辅助字段
    private String categoryCode;

    private Integer isRun;

    private Integer isConnect;

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getAppUserPhone() {
        return appUserPhone;
    }

    public void setAppUserPhone(String appUserPhone) {
        this.appUserPhone = appUserPhone;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getFullAdderss() {
        return fullAdderss;
    }

    public void setFullAdderss(String fullAdderss) {
        this.fullAdderss = fullAdderss;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public List<DeviceStrainerListDTO> getStrainerList() {
        return strainerList;
    }

    public void setStrainerList(List<DeviceStrainerListDTO> strainerList) {
        this.strainerList = strainerList;
    }
}
