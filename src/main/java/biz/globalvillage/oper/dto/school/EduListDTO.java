package biz.globalvillage.oper.dto.school;

public class EduListDTO {
    private Long id;
    //教育局名称
    private String eduName;
    //教育局地址
    private String address;
    //联系人
    private String contactName;
    //联系电话
    private String contactPhone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEduName() {
        return eduName;
    }

    public void setEduName(String eduName) {
        this.eduName = eduName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
