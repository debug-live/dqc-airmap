package biz.globalvillage.tools.dto.classes;

public class StrainerListDTO {

    private long strainerId;

    private String sn;

    private String modelCode;

    private Integer remainLife;

    private Integer maxLife;

    private String modelName;

    private String lifeRate;

    public long getStrainerId() {
        return strainerId;
    }

    public void setStrainerId(long strainerId) {
        this.strainerId = strainerId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public Integer getRemainLife() {
        return remainLife;
    }

    public void setRemainLife(Integer remainLife) {
        this.remainLife = remainLife;
    }

    public Integer getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(Integer maxLife) {
        this.maxLife = maxLife;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getLifeRate() {
        return lifeRate;
    }

    public void setLifeRate(String lifeRate) {
        this.lifeRate = lifeRate;
    }
}
