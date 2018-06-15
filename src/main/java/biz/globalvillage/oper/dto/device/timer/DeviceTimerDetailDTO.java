package biz.globalvillage.oper.dto.device.timer;

import java.util.Date;

public class DeviceTimerDetailDTO {

    private Long classId;

    private String className;

    private String timerSn;

    private String executeRepeatStr;

    private String executeTimeStr;

    private Integer timerSwitch;

    private Integer workModel;

    private Integer uvSwitch;

    private Integer windSpeed;

    private Integer restart;


    //辅助字段
    private Date executeTime;

    private Integer executeRepeat;

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTimerSn() {
        return timerSn;
    }

    public void setTimerSn(String timerSn) {
        this.timerSn = timerSn;
    }

    public String getExecuteRepeatStr() {
        return executeRepeatStr;
    }

    public void setExecuteRepeatStr(String executeRepeatStr) {
        this.executeRepeatStr = executeRepeatStr;
    }

    public String getExecuteTimeStr() {
        return executeTimeStr;
    }

    public void setExecuteTimeStr(String executeTimeStr) {
        this.executeTimeStr = executeTimeStr;
    }

    public Integer getTimerSwitch() {
        return timerSwitch;
    }

    public void setTimerSwitch(Integer timerSwitch) {
        this.timerSwitch = timerSwitch;
    }

    public Integer getWorkModel() {
        return workModel;
    }

    public void setWorkModel(Integer workModel) {
        this.workModel = workModel;
    }

    public Integer getUvSwitch() {
        return uvSwitch;
    }

    public void setUvSwitch(Integer uvSwitch) {
        this.uvSwitch = uvSwitch;
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Integer getRestart() {
        return restart;
    }

    public void setRestart(Integer restart) {
        this.restart = restart;
    }
}
