package biz.globalvillage.oper.dto.statistics;

public class DeviceConnReportDTO {

    private String sn;

    private int connNum;

    private String fullAddress;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public int getConnNum() {
        return connNum;
    }

    public void setConnNum(int connNum) {
        this.connNum = connNum;
    }

    public String getFullAddress() {
//        if(StringUtils.isNotBlank(fullAddress)){
//            return fullAddress.replace("null","");
//        }
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }
}
