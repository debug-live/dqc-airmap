package biz.globalvillage.oper.dto.device.mcu;

public class DeviceMcuListDTO {

    private long deviceMcuId;

    private String deviceModelName;

    private String factoryName;

    private String mcuVersion; //mcu固件版本号

    private String mcuSoftVersion; //mcu软件版本号

    private String mcuDownloadUrl;

    private String dmDownloadUrl;

    public long getDeviceMcuId() {
        return deviceMcuId;
    }

    public void setDeviceMcuId(long deviceMcuId) {
        this.deviceMcuId = deviceMcuId;
    }

    public String getDeviceModelName() {
        return deviceModelName;
    }

    public void setDeviceModelName(String deviceModelName) {
        this.deviceModelName = deviceModelName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getMcuVersion() {
        return mcuVersion;
    }

    public void setMcuVersion(String mcuVersion) {
        this.mcuVersion = mcuVersion;
    }

    public String getMcuSoftVersion() {
        return mcuSoftVersion;
    }

    public void setMcuSoftVersion(String mcuSoftVersion) {
        this.mcuSoftVersion = mcuSoftVersion;
    }

    public String getMcuDownloadUrl() {
        return mcuDownloadUrl;
    }

    public void setMcuDownloadUrl(String mcuDownloadUrl) {
        this.mcuDownloadUrl = mcuDownloadUrl;
    }

    public String getDmDownloadUrl() {
        return dmDownloadUrl;
    }

    public void setDmDownloadUrl(String dmDownloadUrl) {
        this.dmDownloadUrl = dmDownloadUrl;
    }
}
