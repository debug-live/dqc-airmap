package biz.globalvillage.oper.dto.device.timer;

import java.util.Date;

public class DeviceTimerListDTO {

    private Long classId;

    private String className;

    private Integer timerSn;

    private String executeRepeatStr;

    private String executeTimeStr;

    private String operStr;

    //辅助字段
    private Date executeTime;

    private Integer executeRepeat;

    private Integer timerSwitch;

    private Integer workModel;

    private Integer uvSwitch;

    private Integer windSpeed;

    private Integer restart;

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

    public Integer getTimerSn() {
        return timerSn;
    }

    public void setTimerSn(Integer timerSn) {
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

    public String getOperStr() {
        return operStr;
    }

    public void setOperStr(String operStr) {
        this.operStr = operStr;
    }
}
