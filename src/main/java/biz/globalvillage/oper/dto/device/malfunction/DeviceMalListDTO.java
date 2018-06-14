package biz.globalvillage.oper.dto.device.malfunction;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class DeviceMalListDTO {

    private String nickName;

    private String deviceSn;

    private String companyName;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private LocalDateTime accourTime;

    private Integer mulEngineErr;

    private Integer mulSensorErr;

    private Integer mulStrainerErr;

    private Integer mulUVErr;

    private Integer pm25Err;

    private String activeName;

    //辅助字段
    private Integer isActive;

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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDateTime getAccourTime() {
        return accourTime;
    }

    public void setAccourTime(LocalDateTime accourTime) {
        this.accourTime = accourTime;
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

    public String getActiveName() {
        return activeName;
    }

    public void setActiveName(String activeName) {
        this.activeName = activeName;
    }
}
