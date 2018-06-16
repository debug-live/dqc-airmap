package biz.globalvillage.oper.param.school;

public class SchoolListParam {
    private String schoolName;
    private String contactName;
    private String telphone;
    private int page;
    private int limi;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
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

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimi() {
        return limi;
    }

    public void setLimi(int limi) {
        this.limi = limi;
    }
}
