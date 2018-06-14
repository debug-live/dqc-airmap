package biz.globalvillage.oper.param.device;

import biz.globalvillage.airmap.param.page.PageParam;

public class DeviceListForGeoParam extends PageParam {

    private long categoryId;

    private Integer provinceId;

    private Integer cityId;

    private String nickName;

    private String deviceSn;

    private Integer isConnect;

    private int hasAddress;

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
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

    public Integer getIsConnect() {
        return isConnect;
    }

    public void setIsConnect(Integer isConnect) {
        this.isConnect = isConnect;
    }

    public int getHasAddress() {
        return hasAddress;
    }

    public void setHasAddress(int hasAddress) {
        this.hasAddress = hasAddress;
    }
}
