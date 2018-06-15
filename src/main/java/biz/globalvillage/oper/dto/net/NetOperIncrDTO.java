package biz.globalvillage.oper.dto.net;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class NetOperIncrDTO {

    private String incr;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private LocalDate countDay;

    public String getIncr() {
        return incr;
    }

    public void setIncr(String incr) {
        this.incr = incr;
    }

    public LocalDate getCountDay() {
        return countDay;
    }

    public void setCountDay(LocalDate countDay) {
        this.countDay = countDay;
    }
}
