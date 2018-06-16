package biz.globalvillage.oper.dto.school;

public class SchoolLiveDeviceGeneralDTO {
    //学校名称
    private String schoolName;
    //设备总数
    private int deviceNum;
    //开通服务的班级数
    private int openClassNum;
    //开机的设备
    private int runDeviceNum;
    //联网的设备
    private int connDeviceNum;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(int deviceNum) {
        this.deviceNum = deviceNum;
    }

    public int getOpenClassNum() {
        return openClassNum;
    }

    public void setOpenClassNum(int openClassNum) {
        this.openClassNum = openClassNum;
    }

    public int getRunDeviceNum() {
        return runDeviceNum;
    }

    public void setRunDeviceNum(int runDeviceNum) {
        this.runDeviceNum = runDeviceNum;
    }

    public int getConnDeviceNum() {
        return connDeviceNum;
    }

    public void setConnDeviceNum(int connDeviceNum) {
        this.connDeviceNum = connDeviceNum;
    }
}
