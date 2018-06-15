package biz.globalvillage.oper.dto.factory;

public class FactoryDetialDTO {
    //工厂名称
    private String factoryName;
    //工厂编码
    private String factoryCode;
    //联系电话
    private String factoryMobile;
    //联系人
    private String factoryContact;

    private Long provinceId;

    private Long cityId;

    private Long districtId;

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

    public String getFactoryMobile() {
        return factoryMobile;
    }

    public void setFactoryMobile(String factoryMobile) {
        this.factoryMobile = factoryMobile;
    }

    public String getFactoryContact() {
        return factoryContact;
    }

    public void setFactoryContact(String factoryContact) {
        this.factoryContact = factoryContact;
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