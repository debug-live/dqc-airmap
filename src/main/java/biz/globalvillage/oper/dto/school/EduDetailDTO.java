package biz.globalvillage.oper.dto.school;

public class EduDetailDTO {
    //教育局名称
    private String eduName;
    //联系人
    private String contactName;
    //联系电话
    private String contactPhone;
    //省份
    private String provinceId;
    //城市
    private String cityCode;
    //区县
    private String districtCode;
    //具体地址
    private String address;

    public String getEduName() {
        return eduName;
    }

    public void setEduName(String eduName) {
        this.eduName = eduName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
