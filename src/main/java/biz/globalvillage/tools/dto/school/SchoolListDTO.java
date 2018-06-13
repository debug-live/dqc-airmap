package biz.globalvillage.tools.dto.school;

public class SchoolListDTO {

    private Long schoolId;

    private String schoolName;

    private String logoUrl;

    private int openClassNum;

    private int deviceNums;

    private String telephone;

    private String logo;

    private String provinceName;

    private String cityName;

    private String districtName;

    private String address;

    private String fullAddress;

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getLogoUrl() {
//        if(StringUtils.isNotBlank(logo)){
//            return QiniuUtil.getDownUrl(logo);
//        }
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public int getOpenClassNum() {
        return openClassNum;
    }

    public void setOpenClassNum(int openClassNum) {
        this.openClassNum = openClassNum;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getDeviceNums() {
        return deviceNums;
    }

    public void setDeviceNums(int deviceNums) {
        this.deviceNums = deviceNums;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }


    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullAddress() {
        StringBuilder sb = new StringBuilder();

//        if(StringUtils.isNotBlank(provinceName)){
//            sb.append(provinceName);
//        }
//        if(StringUtils.isNotBlank(cityName)){
//            sb.append(cityName);
//        }
//        if(StringUtils.isNotBlank(districtName)){
//            sb.append(districtName);
//        }
//        if(StringUtils.isNotBlank(address)){
//            sb.append(address);
//        }
        return sb.toString();
    }

}
