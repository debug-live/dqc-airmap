package biz.globalvillage.oper.param.device.malfunction;

import biz.globalvillage.airmap.param.page.PageParam;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class DeviceMalListParam extends PageParam {

    private String nickName;

    private String deviceSn;

    private Long dealerId;

    private Long factoryId;

    private Long companyId;

    private Long categoryId;

    private Integer isActive;

    private Integer mulEngineErr;

    private Integer mulSensorErr;

    private Integer mulStrainerErr;

    private Integer mulUVErr;

    private Integer pm25Err;
    
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate startDate;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }

    public Long getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Long factoryId) {
        this.factoryId = factoryId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getMulEngineErr() {
        return mulEngineErr;
    }

    public void setMulEngineErr(Integer mulEngineErr) {
        this.mulEngineErr = mulEngineErr;
    }

    public Integer getMulSensorErr() {
        return mulSensorErr;
    }

    public void setMulSensorErr(Integer mulSensorErr) {
        this.mulSensorErr = mulSensorErr;
    }

    public Integer getMulStrainerErr() {
        return mulStrainerErr;
    }

    public void setMulStrainerErr(Integer mulStrainerErr) {
        this.mulStrainerErr = mulStrainerErr;
    }

    public Integer getMulUVErr() {
        return mulUVErr;
    }

    public void setMulUVErr(Integer mulUVErr) {
        this.mulUVErr = mulUVErr;
    }

    public Integer getPm25Err() {
        return pm25Err;
    }

    public void setPm25Err(Integer pm25Err) {
        this.pm25Err = pm25Err;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
