package biz.globalvillage.oper.param.device.timer;

import biz.globalvillage.airmap.param.page.PageParam;

public class DeviceTimerListParam extends PageParam {

    private Long schoolId;

    private String className;

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
