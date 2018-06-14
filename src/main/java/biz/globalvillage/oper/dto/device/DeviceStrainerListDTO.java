package biz.globalvillage.oper.dto.device;

import java.time.LocalDate;

public class DeviceStrainerListDTO {

    private String categoryName;

    private String modelName;

    private String sn;

    private String lifeRate;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getLifeRate() {
        return lifeRate;
    }

    public void setLifeRate(String lifeRate) {
        this.lifeRate = lifeRate;
    }
}
