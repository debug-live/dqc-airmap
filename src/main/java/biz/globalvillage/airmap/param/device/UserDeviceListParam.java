package biz.globalvillage.airmap.param.device;

import biz.globalvillage.airmap.param.page.PageParam;

public class UserDeviceListParam extends PageParam {

    private String userToken;

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }
}
