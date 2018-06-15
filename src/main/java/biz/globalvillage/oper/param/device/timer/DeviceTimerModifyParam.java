package biz.globalvillage.oper.param.device.timer;

public class DeviceTimerModifyParam {

    private String classIds;

    private String executeTimeStr;

    private Integer executeRepeat;

    private Integer timerSwitch;

    private Integer workModel;

    private Integer uvSwitch;

    private Integer windSpeed;

    private Integer restart;

    public String getClassIds() {
        return classIds;
    }

    public void setClassIds(String classIds) {
        this.classIds = classIds;
    }

    public String getExecuteTimeStr() {
        return executeTimeStr;
    }

    public void setExecuteTimeStr(String executeTimeStr) {
        this.executeTimeStr = executeTimeStr;
    }

    public Integer getExecuteRepeat() {
        return executeRepeat;
    }

    public void setExecuteRepeat(Integer executeRepeat) {
        this.executeRepeat = executeRepeat;
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
