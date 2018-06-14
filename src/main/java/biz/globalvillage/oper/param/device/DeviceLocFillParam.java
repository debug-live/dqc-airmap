package biz.globalvillage.oper.param.device;

import org.springframework.web.bind.annotation.RequestParam;

public class DeviceLocFillParam {

    private long deviceId;

    private long areaId;

    private String fullAddress;


    public long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    public long getAreaId() {
        return areaId;
    }

    public void setAreaId(long areaId) {
        this.areaId = areaId;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }
}
