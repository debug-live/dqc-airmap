package biz.globalvillage.oper.dto.net;

public class NetDevOnlineDTO {

    private int total;

    private int offline;

    private int onLineRun;

    private int onLineStop;

    public NetDevOnlineDTO(int total, int offline, int onLineRun, int onLineStop) {
        this.total = total;
        this.offline = offline;
        this.onLineRun = onLineRun;
        this.onLineStop = onLineStop;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getOffline() {
        return offline;
    }

    public void setOffline(int offline) {
        this.offline = offline;
    }

    public int getOnLineRun() {
        return onLineRun;
    }

    public void setOnLineRun(int onLineRun) {
        this.onLineRun = onLineRun;
    }

    public int getOnLineStop() {
        return onLineStop;
    }

    public void setOnLineStop(int onLineStop) {
        this.onLineStop = onLineStop;
    }
}
