package biz.globalvillage.oper.param.net;

import com.globalvillage.bg.web.param.page.PageParam;

public class NetBrokerListParam extends PageParam{

    private String brokerPhone;

    private String brokerName;

    public String getBrokerPhone() {
        return brokerPhone;
    }

    public void setBrokerPhone(String brokerPhone) {
        this.brokerPhone = brokerPhone;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }
}
