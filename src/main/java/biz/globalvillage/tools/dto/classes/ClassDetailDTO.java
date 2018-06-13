package biz.globalvillage.tools.dto.classes;

import java.util.List;

public class ClassDetailDTO {

    private long classServeId;

    private String serviceStartStr;

    private String serviceEndStr;

    private List<ClassDeviceDTO> devices;

    public long getClassServeId() {
        return classServeId;
    }

    public void setClassServeId(long classServeId) {
        this.classServeId = classServeId;
    }

    public String getServiceStartStr() {
        return serviceStartStr;
    }

    public void setServiceStartStr(String serviceStartStr) {
        this.serviceStartStr = serviceStartStr;
    }

    public String getServiceEndStr() {
        return serviceEndStr;
    }

    public void setServiceEndStr(String serviceEndStr) {
        this.serviceEndStr = serviceEndStr;
    }

    public List<ClassDeviceDTO> getDevices() {
        return devices;
    }

    public void setDevices(List<ClassDeviceDTO> devices) {
        this.devices = devices;
    }
}
