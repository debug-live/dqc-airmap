package biz.globalvillage.oper.param.factory;

public class FactoryLockParam {
    private Long factoryId;
    private Boolean isLock;

    public Long getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Long factoryId) {
        this.factoryId = factoryId;
    }

    public Boolean getLock() {
        return isLock;
    }

    public void setLock(Boolean lock) {
        isLock = lock;
    }
}
