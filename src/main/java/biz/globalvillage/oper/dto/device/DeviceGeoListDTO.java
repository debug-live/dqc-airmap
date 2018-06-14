package biz.globalvillage.oper.dto.device;

public class DeviceGeoListDTO {

    private Long deviceId;  //主键

    private String sn;  //设备序列号

    private String companyName; //公司名称

    private String nickName;  //用户设置的设备昵称

    private String fullAdderss;  //设备所在地址

    private String isConnect; //是否联网

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getFullAdderss() {
        return fullAdderss;
    }

    public void setFullAdderss(String fullAdderss) {
        this.fullAdderss = fullAdderss;
    }

    public String getIsConnect() {
        return isConnect;
    }

    public void setIsConnect(String isConnect) {
        this.isConnect = isConnect;
    }
}
