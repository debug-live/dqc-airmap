package biz.globalvillage.tools.param.classes;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

public class ClassAddParam {

    private int gradeId;

    private String className;

    private long schoolId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate serviceStart;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate serviceEnd;

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(long schoolId) {
        this.schoolId = schoolId;
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
