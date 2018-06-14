package biz.globalvillage.oper.dto.device;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class DeviceUserListDTO {

    private String userPhone;

    private String sn;

    private String appPhoneTypeName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime appRegDate;

    private String fullAdderss;

    private String companyName;

    //辅助字段
    private int appPhoneType;

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getAppPhoneTypeName() {
        return appPhoneTypeName;
    }

    public void setAppPhoneTypeName(String appPhoneTypeName) {
        this.appPhoneTypeName = appPhoneTypeName;
    }

    public LocalDateTime getAppRegDate() {
        return appRegDate;
    }

    public void setAppRegDate(LocalDateTime appRegDate) {
        this.appRegDate = appRegDate;
    }

    public String getFullAdderss() {
        return fullAdderss;
    }

    public void setFullAdderss(String fullAdderss) {
        this.fullAdderss = fullAdderss;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
