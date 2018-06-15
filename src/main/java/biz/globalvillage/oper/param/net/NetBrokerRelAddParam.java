package biz.globalvillage.oper.param.net;

import java.util.List;

public class NetBrokerRelAddParam {

    private long brokerId;

    private List<Long> netIds;

    public long getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(long brokerId) {
        this.brokerId = brokerId;
    }

    public List<Long> getNetIds() {
        return netIds;
    }

    public void setNetIds(List<Long> netIds) {
        this.netIds = netIds;
    }
}
