package biz.globalvillage.oper.dto.school;

public class SchoolListDTO {
    private long schoolId;
    //学校名称
    private String schoolName;
    //学校地址
    private String address;
    //联系人
    private String contactName;
    //联系电话
    private String telphone;
    //服务商名称
    private String dealerName;
    //班级数量
    private int classNums;
    //设备数量
    private int deviceNums;

    public long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(long schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
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

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public int getClassNums() {
        return classNums;
    }

    public void setClassNums(int classNums) {
        this.classNums = classNums;
    }

    public int getDeviceNums() {
        return deviceNums;
    }

    public void setDeviceNums(int deviceNums) {
        this.deviceNums = deviceNums;
    }
}
