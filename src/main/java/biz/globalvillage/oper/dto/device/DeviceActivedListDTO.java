package biz.globalvillage.oper.dto.device;

public class DeviceActivedListDTO {

    private String deviceSn;

    private String nickName;

    private String connectStateStr;

    private String companyName;

    //辅助字段
    private int isConnect;

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
}
