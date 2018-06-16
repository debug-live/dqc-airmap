package biz.globalvillage.oper.dto.net;

import com.globalvillage.bg.common.enums.net.NetTypeEnum;

public class NetListDTO {

    private long id;

    private String netName;

    private String contactName;

    private String contactPhone;

    private String netTypeName;

    private String cityName;

    private int isLock;

    private String shareCode;

    //辅助字段
    private int netType;

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

    public String getNetTypeName() {
        return NetTypeEnum.getNameByValue(netType);
    }

    public void setNetTypeName(String netTypeName) {
        this.netTypeName = netTypeName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getIsLock() {
        return isLock;
    }

    public void setIsLock(int isLock) {
        this.isLock = isLock;
    }

    public String getShareCode() {
        return shareCode;
    }

    public void setShareCode(String shareCode) {
        this.shareCode = shareCode;
    }
}
