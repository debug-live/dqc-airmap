package biz.globalvillage.oper.param.dealer;

public class StrainerCostListParam {
    private String strainerModelCode;
    private String deviceSn;
    private String lifeRate;
    private String appUserPhone;
    private int page;
    private Integer limit;

    public String getStrainerModelCode() {
        return strainerModelCode;
    }

    public void setStrainerModelCode(String strainerModelCode) {
        this.strainerModelCode = strainerModelCode;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getLifeRate() {
        return lifeRate;
    }

    public void setLifeRate(String lifeRate) {
        this.lifeRate = lifeRate;
    }

    public String getAppUserPhone() {
        return appUserPhone;
    }

    public void setAppUserPhone(String appUserPhone) {
        this.appUserPhone = appUserPhone;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
