package biz.globalvillage.oper.param.device.batch;

import biz.globalvillage.airmap.param.page.PageParam;

public class DeviceBatchSnListParam extends PageParam {

    private long batchId;

    private String sn;

    private int isWaste;

    public long getBatchId() {
        return batchId;
    }

    public void setBatchId(long batchId) {
        this.batchId = batchId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public int getIsWaste() {
        return isWaste;
    }

    public void setIsWaste(int isWaste) {
        this.isWaste = isWaste;
    }
}
