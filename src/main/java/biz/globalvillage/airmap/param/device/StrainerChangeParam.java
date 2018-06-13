package biz.globalvillage.airmap.param.device;

public class StrainerChangeParam {

    private String userToken;

    private String deviceSn;

    private String newStrainerSn;

    private String strainerModelCode;

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getNewStrainerSn() {
        return newStrainerSn;
    }

    public void setNewStrainerSn(String newStrainerSn) {
        this.newStrainerSn = newStrainerSn;
    }

    public String getStrainerModelCode() {
        return strainerModelCode;
    }

    public void setStrainerModelCode(String strainerModelCode) {
        this.strainerModelCode = strainerModelCode;
    }
}
