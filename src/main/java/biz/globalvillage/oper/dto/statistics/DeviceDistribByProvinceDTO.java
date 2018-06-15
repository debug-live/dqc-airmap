package biz.globalvillage.oper.dto.statistics;

public class DeviceDistribByProvinceDTO {
    
    private String areaName;

    private String shortName;

    private String areaCode;

    private String deviceCount;

    private String deviceRatio;

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getDeviceCount() {
        return deviceCount;
    }

    public void setDeviceCount(String deviceCount) {
        this.deviceCount = deviceCount;
    }

    public String getDeviceRatio() {
        return deviceRatio;
    }

    public void setDeviceRatio(String deviceRatio) {
        this.deviceRatio = deviceRatio;
    }
}
