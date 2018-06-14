package biz.globalvillage.oper.param.device;

import biz.globalvillage.airmap.param.page.PageParam;
import sun.jvm.hotspot.debugger.Page;

public class DeviceUserListParam extends PageParam {

    private String userPhone;

    private int remainLifeSort;

    private int osType;

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public int getRemainLifeSort() {
        return remainLifeSort;
    }

    public void setRemainLifeSort(int remainLifeSort) {
        this.remainLifeSort = remainLifeSort;
    }

    public int getOsType() {
        return osType;
    }

    public void setOsType(int osType) {
        this.osType = osType;
    }
}
