package biz.globalvillage.airmap.bean.device;

public class DeviceRunStatus {

    private boolean isRunning;

    private boolean isLock;

    private boolean uvRunning;

    private int windSpeed;

    private int model;

    private int filterRemainderLife;

    private boolean childLock;

    private int lowerStrainerLife;

    private int mediumStrainerLife;

    private int higherStrainerLife;

    private int carbonStrainerLife;

    private int uvLife;

    private int lsWindTimeCost;

    private int msWindTimeCost;

    private int hsWindTimeCost;

    private int autoRealModel;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public boolean isLock() {
        return isLock;
    }

    public void setLock(boolean lock) {
        isLock = lock;
    }

    public boolean isUvRunning() {
        return uvRunning;
    }

    public void setUvRunning(boolean uvRunning) {
        this.uvRunning = uvRunning;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getFilterRemainderLife() {
        return filterRemainderLife;
    }

    public void setFilterRemainderLife(int filterRemainderLife) {
        this.filterRemainderLife = filterRemainderLife;
    }

    public boolean isChildLock() {
        return childLock;
    }

    public void setChildLock(boolean childLock) {
        this.childLock = childLock;
    }

    public int getLowerStrainerLife() {
        return lowerStrainerLife;
    }

    public void setLowerStrainerLife(int lowerStrainerLife) {
        this.lowerStrainerLife = lowerStrainerLife;
    }

    public int getMediumStrainerLife() {
        return mediumStrainerLife;
    }

    public void setMediumStrainerLife(int mediumStrainerLife) {
        this.mediumStrainerLife = mediumStrainerLife;
    }

    public int getHigherStrainerLife() {
        return higherStrainerLife;
    }

    public void setHigherStrainerLife(int higherStrainerLife) {
        this.higherStrainerLife = higherStrainerLife;
    }

    public int getCarbonStrainerLife() {
        return carbonStrainerLife;
    }

    public void setCarbonStrainerLife(int carbonStrainerLife) {
        this.carbonStrainerLife = carbonStrainerLife;
    }

    public int getUvLife() {
        return uvLife;
    }

    public void setUvLife(int uvLife) {
        this.uvLife = uvLife;
    }

    public int getLsWindTimeCost() {
        return lsWindTimeCost;
    }

    public void setLsWindTimeCost(int lsWindTimeCost) {
        this.lsWindTimeCost = lsWindTimeCost;
    }

    public int getMsWindTimeCost() {
        return msWindTimeCost;
    }

    public void setMsWindTimeCost(int msWindTimeCost) {
        this.msWindTimeCost = msWindTimeCost;
    }

    public int getHsWindTimeCost() {
        return hsWindTimeCost;
    }

    public void setHsWindTimeCost(int hsWindTimeCost) {
        this.hsWindTimeCost = hsWindTimeCost;
    }

    public int getAutoRealModel() {
        return autoRealModel;
    }

    public void setAutoRealModel(int autoRealModel) {
        this.autoRealModel = autoRealModel;
    }
}
