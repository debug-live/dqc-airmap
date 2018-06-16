package biz.globalvillage.common.entity.net;

import java.time.LocalDate;

public class NetDeviceRel {

    private Long id;

    private Long netId;

    private Long deviceId;

    private LocalDate createTime;

    public NetDeviceRel() {
    }

    public NetDeviceRel(Long netId, Long deviceId, LocalDate createTime) {
        this.netId = netId;
        this.deviceId = deviceId;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNetId() {
        return netId;
    }

    public void setNetId(Long netId) {
        this.netId = netId;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }
}