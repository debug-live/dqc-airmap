package biz.globalvillage.tools.param.classes;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class ClassServiceTimeModifyParam {

    private long classServeId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate serviceStart;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate serviceEnd;

    public long getClassServeId() {
        return classServeId;
    }

    public void setClassServeId(long classServeId) {
        this.classServeId = classServeId;
    }

    public LocalDate getServiceStart() {
        return serviceStart;
    }

    public void setServiceStart(LocalDate serviceStart) {
        this.serviceStart = serviceStart;
    }

    public LocalDate getServiceEnd() {
        return serviceEnd;
    }

    public void setServiceEnd(LocalDate serviceEnd) {
        this.serviceEnd = serviceEnd;
    }
}
