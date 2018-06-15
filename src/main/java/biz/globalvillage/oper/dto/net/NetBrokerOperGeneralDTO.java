package biz.globalvillage.oper.dto.net;

import java.util.Map;

public class NetBrokerOperGeneralDTO {

    private int netNum;

    private String dealAmount;

    private long totalOrders;

    private int totalUsers;

    private Map<String,Object> goodsNum;

    public int getNetNum() {
        return netNum;
    }

    public void setNetNum(int netNum) {
        this.netNum = netNum;
    }

    public String getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(String dealAmount) {
        this.dealAmount = dealAmount;
    }

    public long getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(long totalOrders) {
        this.totalOrders = totalOrders;
    }

    public int getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }

    public Map<String, Object> getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Map<String, Object> goodsNum) {
        this.goodsNum = goodsNum;
    }
}
