package biz.globalvillage.oper.param.school;

import java.util.Date;

public class SaveSchoolParam {
    //学校名称
    private String schoolName;
    //联系人
    private String contacts;
    //联系电话
    private String telphone;
    //省份
    private Long provinceId;
    //城市
    private Long cityId;
    //区县
    private Long districtId;
    //具体地址
    private String address;
    //学校logo
    private String logo;
    //学校主图
    private String mainPic;
    //品牌商
    private Long companyId;
    //服务商电话
    private String dealerPhone;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getMainPic() {
        return mainPic;
    }

    public void setMainPic(String mainPic) {
        this.mainPic = mainPic;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getDealerPhone() {
        return dealerPhone;
    }

    public void setDealerPhone(String dealerPhone) {
        this.dealerPhone = dealerPhone;
    }
}
