package biz.globalvillage.oper.param.device.batch;

import biz.globalvillage.airmap.param.page.PageParam;

public class DeviceBatchListParam extends PageParam {

    private String batchName;

    private long companyId;

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }
}
