package biz.globalvillage.common.entity.device.malfunction;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class DeviceMalfunction {

    private long id;

    private Long deviceId;

    private Integer mulEngineErr;

    private Integer mulSensorErr;

    private Integer mulStrainerErr;

    private Integer mulUvErr;

    private Integer pm25Err;

    private Integer isActive;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private LocalDateTime createDate;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private LocalDateTime modifyDate;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private LocalDateTime accourTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
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

    public Integer getMulUvErr() {
        return mulUvErr;
    }

    public void setMulUvErr(Integer mulUvErr) {
        this.mulUvErr = mulUvErr;
    }

    public Integer getPm25Err() {
        return pm25Err;
    }

    public void setPm25Err(Integer pm25Err) {
        this.pm25Err = pm25Err;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(LocalDateTime modifyDate) {
        this.modifyDate = modifyDate;
    }

    public LocalDateTime getAccourTime() {
        return accourTime;
    }

    public void setAccourTime(LocalDateTime accourTime) {
        this.accourTime = accourTime;
    }
}
