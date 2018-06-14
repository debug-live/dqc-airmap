package biz.globalvillage.oper.dto.device;

public class DeviceUserListDTO {

    private String userPhone;

    private int remainLifeSort;

    private int osType;

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public int getRemainLifeSort() {
        return remainLifeSort;
    }

    public void setRemainLifeSort(int remainLifeSort) {
        this.remainLifeSort = remainLifeSort;
    }

    public int getOsType() {
        return osType;
    }

    public void setOsType(int osType) {
        this.osType = osType;
    }
}
