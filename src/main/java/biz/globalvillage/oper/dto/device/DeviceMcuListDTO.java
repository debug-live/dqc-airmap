package biz.globalvillage.oper.dto.device;

public class DeviceMcuListDTO {

    private long deviceId;

    private String deviceSn;

    private String nickName;

    private String connectStateStr;

    private String companyName;

    private String mcuVersion;

    private String mcuSoftVersion;

    private String dataModuleVersion;

    private int canMcuUpdate;

    public long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getConnectStateStr() {
        return connectStateStr;
    }

    public void setConnectStateStr(String connectStateStr) {
        this.connectStateStr = connectStateStr;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public String getDataModuleVersion() {
        return dataModuleVersion;
    }

    public void setDataModuleVersion(String dataModuleVersion) {
        this.dataModuleVersion = dataModuleVersion;
    }

    public int getCanMcuUpdate() {
        return canMcuUpdate;
    }

    public void setCanMcuUpdate(int canMcuUpdate) {
        this.canMcuUpdate = canMcuUpdate;
    }
}
