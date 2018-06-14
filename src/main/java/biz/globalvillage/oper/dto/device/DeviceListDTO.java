package biz.globalvillage.oper.dto.device;

import java.util.Date;
import java.util.List;

public class DeviceListDTO {

    private Long deviceId;  //主键

    private String sn;  //设备序列号

    private String companyName; //公司名称

    private String nickName;  //用户设置的设备昵称

    private String fullAdderss;  //设备所在地址

    private String deviceStatus; //设备状态

    private String channelName; //销售渠道

    private String appUserPhone; //设备用户

    private Integer remainingLife;   //滤网剩余寿命,以分钟数保存


    //辅助字段
    private String categoryCode;

    private Integer isRun;

    private Integer isConnect; //是否连接，1：链接；0：未连接


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

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
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

    public Integer getRemainingLife() {
        return remainingLife;
    }

    public void setRemainingLife(Integer remainingLife) {
        this.remainingLife = remainingLife;
    }
}
