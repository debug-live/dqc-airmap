package biz.globalvillage.oper.param.net;

import com.globalvillage.bg.web.param.page.PageParam;

public class NetAllDeviceListParam extends PageParam{

    private String sn;

    private String netName;

    private Integer isConnect;

    private String provinceCode;

    private String cityCode;

    private Integer lifeSort;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getNetName() {
        return netName;
    }

    public void setNetName(String netName) {
        this.netName = netName;
    }

    public Integer getIsConnect() {
        return isConnect;
    }

    public void setIsConnect(Integer isConnect) {
        this.isConnect = isConnect;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getLifeSort() {
        return lifeSort;
    }

    public void setLifeSort(Integer lifeSort) {
        this.lifeSort = lifeSort;
    }
}
