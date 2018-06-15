package biz.globalvillage.oper.param.net;

import com.globalvillage.bg.web.param.page.PageParam;

public class NetDeviceListParam extends PageParam{

    private Long netId;

    private String sn;

    private Integer isConnect;

    private Integer lifeSort;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Integer getIsConnect() {
        return isConnect;
    }

    public void setIsConnect(Integer isConnect) {
        this.isConnect = isConnect;
    }

    public Long getNetId() {
        return netId;
    }

    public void setNetId(Long netId) {
        this.netId = netId;
    }

    public Integer getLifeSort() {
        return lifeSort;
    }

    public void setLifeSort(Integer lifeSort) {
        this.lifeSort = lifeSort;
    }
}
