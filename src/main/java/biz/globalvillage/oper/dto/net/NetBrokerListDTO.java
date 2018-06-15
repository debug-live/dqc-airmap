package biz.globalvillage.oper.dto.net;

public class NetBrokerListDTO {

    private long brokerId;

    private String brokerName;

    private String brokerPhone;

    private int netNum;

    private int orderNum;

    public long getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(long brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public String getBrokerPhone() {
        return brokerPhone;
    }

    public void setBrokerPhone(String brokerPhone) {
        this.brokerPhone = brokerPhone;
    }

    public int getNetNum() {
        return netNum;
    }

    public void setNetNum(int netNum) {
        this.netNum = netNum;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
}
