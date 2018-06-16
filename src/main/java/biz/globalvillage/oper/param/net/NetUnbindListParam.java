package biz.globalvillage.oper.param.net;

import com.globalvillage.bg.web.param.page.PageParam;

public class NetUnbindListParam extends PageParam {

    private String netName;

    private Integer netType;

    private String province;

    private String city;

    public String getNetName() {
        return netName;
    }

    public void setNetName(String netName) {
        this.netName = netName;
    }

    public Integer getNetType() {
        return netType;
    }

    public void setNetType(Integer netType) {
        this.netType = netType;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
