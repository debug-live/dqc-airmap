package biz.globalvillage.oper.param.device;

import biz.globalvillage.airmap.param.page.PageParam;

public class DeviceListParam extends PageParam {

    private long channelId;

    private long categoryId;

    private long modelId;

    private String nickName;

    private String deviceSn;

    private String strainerSn;

    private String appUserPhone;

    private Integer isConnect;

    private Integer isUsed;

    private int remainLifeSort;

    private int addressSort;

    public long getChannelId() {
        return channelId;
    }

    public void setChannelId(long channelId) {
        this.channelId = channelId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public long getModelId() {
        return modelId;
    }

    public void setModelId(long modelId) {
        this.modelId = modelId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getStrainerSn() {
        return strainerSn;
    }

    public void setStrainerSn(String strainerSn) {
        this.strainerSn = strainerSn;
    }

    public String getAppUserPhone() {
        return appUserPhone;
    }

    public void setAppUserPhone(String appUserPhone) {
        this.appUserPhone = appUserPhone;
    }

    public Integer getIsConnect() {
        return isConnect;
    }

    public void setIsConnect(Integer isConnect) {
        this.isConnect = isConnect;
    }

    public Integer getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Integer isUsed) {
        this.isUsed = isUsed;
    }

    public int getRemainLifeSort() {
        return remainLifeSort;
    }

    public void setRemainLifeSort(int remainLifeSort) {
        this.remainLifeSort = remainLifeSort;
    }

    public int getAddressSort() {
        return addressSort;
    }

    public void setAddressSort(int addressSort) {
        this.addressSort = addressSort;
    }
}
