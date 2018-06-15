package biz.globalvillage.oper.dto.dealer;

public class DealerDetailDTO {
    private long roleName;

    private String userName;

    private String phone;

    private String dealerName;

    private Long provinceId;

    private Long cityId;

    private Long adistrictId;

    private String address;

    public long getRoleName() {
        return roleName;
    }

    public void setRoleName(long roleName) {
        this.roleName = roleName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getAdistrictId() {
        return adistrictId;
    }

    public void setAdistrictId(Long adistrictId) {
        this.adistrictId = adistrictId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
