package biz.globalvillage.common.entity.device.batch;

import java.time.LocalDate;

public class DeviceBatch {

    private Long batchId;

    private String batchCode;

    private String batchName;

    private Integer totalBeltline;

    private Long quantity;

    private Long deviceModelId;

    private Long factoryId;

    private Long operatorId;

    private Long companyId;

    private LocalDate createDate;

    private LocalDate modifyDate;

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public Integer getTotalBeltline() {
        return totalBeltline;
    }

    public void setTotalBeltline(Integer totalBeltline) {
        this.totalBeltline = totalBeltline;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getDeviceModelId() {
        return deviceModelId;
    }

    public void setDeviceModelId(Long deviceModelId) {
        this.deviceModelId = deviceModelId;
    }

    public Long getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Long factoryId) {
        this.factoryId = factoryId;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(LocalDate modifyDate) {
        this.modifyDate = modifyDate;
    }
}
