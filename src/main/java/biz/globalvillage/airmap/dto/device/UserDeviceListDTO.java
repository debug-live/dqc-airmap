package biz.globalvillage.airmap.dto.device;

import biz.globalvillage.airmap.bean.air.IndoorAir;
import biz.globalvillage.airmap.bean.air.OutdoorAir;
import biz.globalvillage.airmap.bean.device.DeviceRunStatus;

import java.util.List;

public class UserDeviceListDTO {

    private long deviceId;

    private String nickName;

    private String sn;

    private Long areaId;

    private String areaName;

    private String categoryCode;

    private String modelCode;

    private int serviceType;

    private int isManager;

    private int isConcern;

    private int isConnect;

    private IndoorAir indoorAir;

    private OutdoorAir outdoorAir;

    private DeviceRunStatus deviceRunStatus;

    private List<StrainerListDTO> strainers;

    public long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public int getServiceType() {
        return serviceType;
    }

    public void setServiceType(int serviceType) {
        this.serviceType = serviceType;
    }

    public int getIsManager() {
        return isManager;
    }

    public void setIsManager(int isManager) {
        this.isManager = isManager;
    }

    public int getIsConcern() {
        return isConcern;
    }

    public void setIsConcern(int isConcern) {
        this.isConcern = isConcern;
    }

    public int getIsConnect() {
        return isConnect;
    }

    public void setIsConnect(int isConnect) {
        this.isConnect = isConnect;
    }

    public IndoorAir getIndoorAir() {
        return indoorAir;
    }

    public void setIndoorAir(IndoorAir indoorAir) {
        this.indoorAir = indoorAir;
    }

    public OutdoorAir getOutdoorAir() {
        return outdoorAir;
    }

    public void setOutdoorAir(OutdoorAir outdoorAir) {
        this.outdoorAir = outdoorAir;
    }

    public DeviceRunStatus getDeviceRunStatus() {
        return deviceRunStatus;
    }

    public void setDeviceRunStatus(DeviceRunStatus deviceRunStatus) {
        this.deviceRunStatus = deviceRunStatus;
    }

    public List<StrainerListDTO> getStrainers() {
        return strainers;
    }

    public void setStrainers(List<StrainerListDTO> strainers) {
        this.strainers = strainers;
    }
}
