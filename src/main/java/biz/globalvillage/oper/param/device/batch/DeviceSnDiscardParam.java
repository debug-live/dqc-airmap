package biz.globalvillage.oper.param.device.batch;

import java.util.List;

public class DeviceSnDiscardParam {

    private String categoryCode;

    private List<String> snList;

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public List<String> getSnList() {
        return snList;
    }

    public void setSnList(List<String> snList) {
        this.snList = snList;
    }
}
