package biz.globalvillage.oper.param.device.model;

import biz.globalvillage.airmap.param.page.PageParam;

public class DeviceModelListParam extends PageParam {

    private long categoryId;

    private String modelName;

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
