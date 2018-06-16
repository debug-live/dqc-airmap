package biz.globalvillage.oper.dto.net;

public class NetAllDeviceListDTO {

    private Long deviceId;

    private String deviceSn;

    private String nickName;

    private String netName;

    private String runState;

    private String categoryName;

    private String address;

    private int bindCount;

    private String lifeRate;

    //辅助字段
    private int remainLife;

    private int maxLife;

    private int isConnect;

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
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

    public String getNetName() {
        return netName;
    }

    public void setNetName(String netName) {
        this.netName = netName;
    }

    public String getRunState() {
        return runState;
    }

    public void setRunState(String runState) {
        this.runState = runState;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBindCount() {
        return bindCount;
    }

    public void setBindCount(int bindCount) {
        this.bindCount = bindCount;
    }

    public String getLifeRate() {
        return lifeRate;
    }

    public void setLifeRate(String lifeRate) {
        this.lifeRate = lifeRate;
    }

    public int getRemainLife() {
        return remainLife;
    }

    public void setRemainLife(int remainLife) {
        this.remainLife = remainLife;
    }

    public int getIsConnect() {
        return isConnect;
    }

    public void setIsConnect(int isConnect) {
        this.isConnect = isConnect;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }
}
