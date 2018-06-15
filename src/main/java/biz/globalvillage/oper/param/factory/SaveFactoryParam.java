package biz.globalvillage.oper.param.factory;

public class SaveFactoryParam {
    //生产厂商
    private String factoryName;
    //工厂编码
    private String factoryCode;
    //联系人
    private String factoryContact;
    //联系电话
    private String factoryMobile;
    //省份
    private Long provinceId;
    //城市
    private Long cityId;
    //区
    private Long districtId;
    //详细地址
    private String address;

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(String factoryCode) {
        this.factoryCode = factoryCode;
    }

    public String getFactoryContact() {
        return factoryContact;
    }

    public void setFactoryContact(String factoryContact) {
        this.factoryContact = factoryContact;
    }

    public String getFactoryMobile() {
        return factoryMobile;
    }

    public void setFactoryMobile(String factoryMobile) {
        this.factoryMobile = factoryMobile;
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

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
