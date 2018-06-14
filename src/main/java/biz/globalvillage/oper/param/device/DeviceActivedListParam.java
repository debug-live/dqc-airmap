package biz.globalvillage.oper.param.device;

import biz.globalvillage.airmap.param.page.PageParam;

public class DeviceActivedListParam extends PageParam {

    private String deviceSn;

    private long categoryId;

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }
}
