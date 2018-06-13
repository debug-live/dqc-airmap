package biz.globalvillage.tools.dto.classes;

import biz.globalvillage.airmap.bean.air.IndoorAir;

import java.util.List;
import java.util.Map;

public class ClassDeviceDTO {

    private long deviceId;

    private String nickName;

    private String sn;

    private String categoryCode;

    private String modelCode;

    private int serviceType;

    private int isConnect;

    private String areaName;

    private int weight;

    private IndoorAir indoorAir;

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

    public int getIsConnect() {
        return isConnect;
    }

    public void setIsConnect(int isConnect) {
        this.isConnect = isConnect;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public IndoorAir getIndoorAir() {
        return indoorAir;
    }

    public void setIndoorAir(IndoorAir indoorAir) {
        this.indoorAir = indoorAir;
    }

    public List<StrainerListDTO> getStrainers() {
        return strainers;
    }

    public void setStrainers(List<StrainerListDTO> strainers) {
        this.strainers = strainers;
    }
}
