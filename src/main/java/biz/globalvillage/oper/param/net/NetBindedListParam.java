package biz.globalvillage.oper.param.net;

import com.globalvillage.bg.web.param.page.PageParam;

public class NetBindedListParam extends PageParam {

    private Long brokerId;

    private String netName;

    public String getNetName() {
        return netName;
    }

    public void setNetName(String netName) {
        this.netName = netName;
    }

    public Long getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(Long brokerId) {
        this.brokerId = brokerId;
    }
}
