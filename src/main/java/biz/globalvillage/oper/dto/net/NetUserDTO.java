package biz.globalvillage.oper.dto.net;

public class NetUserDTO {

    private long netId;

    private String netName;

    private String appUserPhone;

    private String cityName;

    public long getNetId() {
        return netId;
    }

    public void setNetId(long netId) {
        this.netId = netId;
    }

    public String getAppUserPhone() {
        return appUserPhone;
    }

    public void setAppUserPhone(String appUserPhone) {
        this.appUserPhone = appUserPhone;
    }

    public String getNetName() {
        return netName;
    }

    public void setNetName(String netName) {
        this.netName = netName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
