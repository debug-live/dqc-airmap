package biz.globalvillage.oper.dto.dealer;

public class StrainerCostListDTO {
    //设备型号
    private String deviceModelName;
    //耗材类型
    private String strainerModelName;
    //设备SN
    private String deviceSn;
    //设备耗材数量
    private int consumableNum;
    //寿命量
    private double lifeRate;
    //所在区域
    private String areaName;
    //联系电话
    private String phone;
    //详细地址
    private String fullAddress;

    public String getDeviceModelName() {
        return deviceModelName;
    }

    public void setDeviceModelName(String deviceModelName) {
        this.deviceModelName = deviceModelName;
    }

    public String getStrainerModelName() {
        return strainerModelName;
    }

    public void setStrainerModelName(String strainerModelName) {
        this.strainerModelName = strainerModelName;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public int getConsumableNum() {
        return consumableNum;
    }

    public void setConsumableNum(int consumableNum) {
        this.consumableNum = consumableNum;
    }

    public double getLifeRate() {
        return lifeRate;
    }

    public void setLifeRate(double lifeRate) {
        this.lifeRate = lifeRate;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }
}
