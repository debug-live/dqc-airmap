package biz.globalvillage.oper.param.dealer;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class DeviceNumIncreListParam {
    private int countType;

    private Date startDate;

    private Date endDate;

    public int getCountType() {
        return countType;
    }

    public void setCountType(int countType) {
        this.countType = countType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
