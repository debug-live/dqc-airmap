package biz.globalvillage.oper.param.sale;


public class DeviceListParam {
    private long orderId;
    private String deviceSn;
    private String strainerSn;
    private int page;
    private int limit;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
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

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
