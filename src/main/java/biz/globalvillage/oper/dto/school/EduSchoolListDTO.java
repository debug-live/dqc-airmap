package biz.globalvillage.oper.dto.school;

public class EduSchoolListDTO {
    private long schoolId;
    //学校名称
    private String schoolName;
    //班级数量
    private int classNums;
    //设备数量
    private int deviceNums;
    //开通班级数量
    private int openClassNums;

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

    public int getOpenClassNums() {
        return openClassNums;
    }

    public void setOpenClassNums(int openClassNums) {
        this.openClassNums = openClassNums;
    }
}
