package biz.globalvillage.oper.dto.device.mcu;

public class DeviceMcuDetailDTO {

    private long id;

    private long companyId;

    private String companyName;

    private long deviceModelId;

    private String deviceModelName;

    private long factoryId;

    private String factoryName;

    private String mcuModel; //mcu固件型号

    private String mcuVersion; //mcu固件版本号

    private String mcuSoftVersion; //mcu软件版本号

    private String mcuSupplier; //mcu固件供应商

    private String dataModuleModel; //数据模块型号

    private String dataModuleVersion; //数据模块版本号

    private String dataModuleSupplier;  //数据模块供应商

    private String mcuDownloadUrl;

    private String dmDownloadUrl;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public long getDeviceModelId() {
        return deviceModelId;
    }

    public void setDeviceModelId(long deviceModelId) {
        this.deviceModelId = deviceModelId;
    }

    public String getDeviceModelName() {
        return deviceModelName;
    }

    public void setDeviceModelName(String deviceModelName) {
        this.deviceModelName = deviceModelName;
    }

    public long getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(long factoryId) {
        this.factoryId = factoryId;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getMcuModel() {
        return mcuModel;
    }

    public void setMcuModel(String mcuModel) {
        this.mcuModel = mcuModel;
    }

    public String getMcuVersion() {
        return mcuVersion;
    }

    public void setMcuVersion(String mcuVersion) {
        this.mcuVersion = mcuVersion;
    }

    public String getMcuSoftVersion() {
        return mcuSoftVersion;
    }

    public void setMcuSoftVersion(String mcuSoftVersion) {
        this.mcuSoftVersion = mcuSoftVersion;
    }

    public String getMcuSupplier() {
        return mcuSupplier;
    }

    public void setMcuSupplier(String mcuSupplier) {
        this.mcuSupplier = mcuSupplier;
    }

    public String getDataModuleModel() {
        return dataModuleModel;
    }

    public void setDataModuleModel(String dataModuleModel) {
        this.dataModuleModel = dataModuleModel;
    }

    public String getDataModuleVersion() {
        return dataModuleVersion;
    }

    public void setDataModuleVersion(String dataModuleVersion) {
        this.dataModuleVersion = dataModuleVersion;
    }

    public String getDataModuleSupplier() {
        return dataModuleSupplier;
    }

    public void setDataModuleSupplier(String dataModuleSupplier) {
        this.dataModuleSupplier = dataModuleSupplier;
    }

    public String getMcuDownloadUrl() {
        return mcuDownloadUrl;
    }

    public void setMcuDownloadUrl(String mcuDownloadUrl) {
        this.mcuDownloadUrl = mcuDownloadUrl;
    }

    public String getDmDownloadUrl() {
        return dmDownloadUrl;
    }

    public void setDmDownloadUrl(String dmDownloadUrl) {
        this.dmDownloadUrl = dmDownloadUrl;
    }
}
