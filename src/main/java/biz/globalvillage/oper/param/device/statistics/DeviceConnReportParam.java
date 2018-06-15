package biz.globalvillage.oper.param.device.statistics;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class DeviceConnReportParam {

    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private LocalDate reportDate;

    private int top;

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
