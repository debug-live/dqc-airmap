package biz.globalvillage.oper.dto.net;

import com.globalvillage.bg.common.enums.net.NetTypeEnum;
import org.apache.commons.lang3.StringUtils;

public class NetDetailDTO {

    private long id;

    private String netName;

    private String contactName;

    private String contactPhone;

    private int netType;

    private String province;

    private String city;

    private String district;

    private String address;

    private int isLock;

    private String shareCode;

    private String netTypeName;

    private String provinceName;

    private String cityName;

    private String districtName;

    private String fullAddress;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNetName() {
        return netName;
    }

    public void setNetName(String netName) {
        this.netName = netName;
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

    public int getNetType() {
        return netType;
    }

    public void setNetType(int netType) {
        this.netType = netType;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIsLock() {
        return isLock;
    }

    public void setIsLock(int isLock) {
        this.isLock = isLock;
    }

    public String getNetTypeName() {
        return NetTypeEnum.getNameByValue(netType);
    }

    public void setNetTypeName(String netTypeName) {
        this.netTypeName = netTypeName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getFullAddress() {
        StringBuilder sb = new StringBuilder();
        if(StringUtils.isNotBlank(provinceName)){
            sb.append(provinceName);
        }
        if(StringUtils.isNotBlank(cityName)){
            sb.append(cityName);
        }
        if(StringUtils.isNotBlank(districtName)){
            sb.append(districtName);
        }
        if(StringUtils.isNotBlank(address)){
            sb.append(address);
        }
        return sb.toString();
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getShareCode() {
        return shareCode;
    }

    public void setShareCode(String shareCode) {
        this.shareCode = shareCode;
    }
}
