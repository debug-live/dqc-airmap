package biz.globalvillage.oper.dto.device.strainer;

public class StrainerDetailDTO {

    private long strainerId;  //主键

    private String strainerModelName;

    private String strainerSn;  //滤网序列号

    private String lifeRate;

    private Integer isBind;  //是否绑定设备

    private Integer isExpire;  //是否过期

    private Integer isWaste;	//是否生产废品

    private String channelName;

    private String deviceModelName;

    private String deviceSn;

    private String fullAddress;

    private int isConnect;

    //辅助字段
    private Integer remainLife;

    public long getStrainerId() {
        return strainerId;
    }

    public void setStrainerId(long strainerId) {
        this.strainerId = strainerId;
    }

    public String getStrainerModelName() {
        return strainerModelName;
    }

    public void setStrainerModelName(String strainerModelName) {
        this.strainerModelName = strainerModelName;
    }

    public String getStrainerSn() {
        return strainerSn;
    }

    public void setStrainerSn(String strainerSn) {
        this.strainerSn = strainerSn;
    }

    public String getLifeRate() {
        return lifeRate;
    }

    public void setLifeRate(String lifeRate) {
        this.lifeRate = lifeRate;
    }

    public Integer getIsBind() {
        return isBind;
    }

    public void setIsBind(Integer isBind) {
        this.isBind = isBind;
    }

    public Integer getIsExpire() {
        return isExpire;
    }

    public void setIsExpire(Integer isExpire) {
        this.isExpire = isExpire;
    }

    public Integer getIsWaste() {
        return isWaste;
    }

    public void setIsWaste(Integer isWaste) {
        this.isWaste = isWaste;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getDeviceModelName() {
        return deviceModelName;
    }

    public void setDeviceModelName(String deviceModelName) {
        this.deviceModelName = deviceModelName;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public int getIsConnect() {
        return isConnect;
    }

    public void setIsConnect(int isConnect) {
        this.isConnect = isConnect;
    }
}
