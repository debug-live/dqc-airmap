package biz.globalvillage.oper.param.device.strainer;

public class StrainerListParam {

    private long channelId;

    private String deviceSn;

    private String strainerSn;

    private String userPhone;

    private Integer isBind;

    private int isExpire;

    private int remainLifeSort;

    public long getChannelId() {
        return channelId;
    }

    public void setChannelId(long channelId) {
        this.channelId = channelId;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getStrainerSn() {
        return strainerSn;
    }

    public void setStrainerSn(String strainerSn) {
        this.strainerSn = strainerSn;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getIsBind() {
        return isBind;
    }

    public void setIsBind(Integer isBind) {
        this.isBind = isBind;
    }

    public int getIsExpire() {
        return isExpire;
    }

    public void setIsExpire(int isExpire) {
        this.isExpire = isExpire;
    }

    public int getRemainLifeSort() {
        return remainLifeSort;
    }

    public void setRemainLifeSort(int remainLifeSort) {
        this.remainLifeSort = remainLifeSort;
    }
}
