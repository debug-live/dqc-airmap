package biz.globalvillage.oper.dto.factory;

public class FactoryListDTO {
    private Long factoryId;
    //生产厂商
    private String factoryName;
    //工厂编码
    private String factoryCode;
    //工厂地址
    private String factoryAddr;
    //联系人
    private String factoryContact;
    //联系电话
    private String factoryMobile;
    //是否锁定
    private int isLock;

    public Long getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Long factoryId) {
        this.factoryId = factoryId;
    }

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

    public String getFactoryAddr() {
        return factoryAddr;
    }

    public void setFactoryAddr(String factoryAddr) {
        this.factoryAddr = factoryAddr;
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

    public int getIsLock() {
        return isLock;
    }

    public void setIsLock(int isLock) {
        this.isLock = isLock;
    }
}
