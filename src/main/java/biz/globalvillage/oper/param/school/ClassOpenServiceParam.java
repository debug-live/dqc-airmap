package biz.globalvillage.oper.param.school;

public class ClassOpenServiceParam {
    private long classId;
    private long schoolId;
    private String serviceStart;
    private String serviceEnd;

    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
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
