package biz.globalvillage.oper.dto.school;

import java.util.List;
import java.util.Map;

public class SchoolLiveDeviceListDTO {
    private long classId;
    private String schoolName;
    private String className;
    private List<Map<String,Object>> devices;

    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Map<String, Object>> getDevices() {
        return devices;
    }

    public void setDevices(List<Map<String, Object>> devices) {
        this.devices = devices;
    }
}
