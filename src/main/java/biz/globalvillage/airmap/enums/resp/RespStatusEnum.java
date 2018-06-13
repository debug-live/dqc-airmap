package biz.globalvillage.airmap.enums.resp;

public enum RespStatusEnum {

    OK(0, "ok"),

    SYS_ERROR(1,"系统错误"),

    DUP_ERROR(101,"系统错误"),

    NORMAL_ERROR(1,"普通异常");

    private final int code;
    private final String msg;

    private RespStatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
