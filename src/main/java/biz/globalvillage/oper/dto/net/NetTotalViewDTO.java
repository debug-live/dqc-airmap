package biz.globalvillage.oper.dto.net;

public class NetTotalViewDTO {

    private int netNum;

    private int netDeviceNum;

    private int netDeviceBindCount;

    private int netOrderNum;

    private String totalAmount;

    public NetTotalViewDTO() {
    }

    public NetTotalViewDTO(int netNum, int netDeviceNum, int netDeviceBindCount, int netOrderNum, String totalAmount) {
        this.netNum = netNum;
        this.netDeviceNum = netDeviceNum;
        this.netDeviceBindCount = netDeviceBindCount;
        this.netOrderNum = netOrderNum;
        this.totalAmount = totalAmount;
    }

    public int getNetNum() {
        return netNum;
    }

    public void setNetNum(int netNum) {
        this.netNum = netNum;
    }

    public int getNetDeviceNum() {
        return netDeviceNum;
    }

    public void setNetDeviceNum(int netDeviceNum) {
        this.netDeviceNum = netDeviceNum;
    }

    public int getNetDeviceBindCount() {
        return netDeviceBindCount;
    }

    public void setNetDeviceBindCount(int netDeviceBindCount) {
        this.netDeviceBindCount = netDeviceBindCount;
    }

    public int getNetOrderNum() {
        return netOrderNum;
    }

    public void setNetOrderNum(int netOrderNum) {
        this.netOrderNum = netOrderNum;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }
}
