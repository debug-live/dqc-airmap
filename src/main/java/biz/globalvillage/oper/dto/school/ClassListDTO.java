package biz.globalvillage.oper.dto.school;

public class ClassListDTO {
    private String classId;
    //班级名称
    private String className;
    //设备数量
    private Integer deviceNum;
    //服务类型
    private Integer openType;
    //服务剩余时间
    private long remainDays;
    //服务状态
    private String serviceState;
    //关注人
    private Integer concernNum;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(Integer deviceNum) {
        this.deviceNum = deviceNum;
    }

    public Integer getOpenType() {
        return openType;
    }

    public void setOpenType(Integer openType) {
        this.openType = openType;
    }

    public long getRemainDays() {
        return remainDays;
    }

    public void setRemainDays(long remainDays) {
        this.remainDays = remainDays;
    }

    public String getServiceState() {
        return serviceState;
    }

    public void setServiceState(String serviceState) {
        this.serviceState = serviceState;
    }

    public Integer getConcernNum() {
        return concernNum;
    }

    public void setConcernNum(Integer concernNum) {
        this.concernNum = concernNum;
    }
}
