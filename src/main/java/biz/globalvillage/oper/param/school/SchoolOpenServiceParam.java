package biz.globalvillage.oper.param.school;

public class SchoolOpenServiceParam {
    private String classIds;
    private long schoolId;
    private String serviceStart;
    private String serviceEnd;

    public String getClassIds() {
        return classIds;
    }

    public void setClassIds(String classIds) {
        this.classIds = classIds;
    }

    public long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(long schoolId) {
        this.schoolId = schoolId;
    }

    public String getServiceStart() {
        return serviceStart;
    }

    public void setServiceStart(String serviceStart) {
        this.serviceStart = serviceStart;
    }

    public String getServiceEnd() {
        return serviceEnd;
    }

    public void setServiceEnd(String serviceEnd) {
        this.serviceEnd = serviceEnd;
    }
}
