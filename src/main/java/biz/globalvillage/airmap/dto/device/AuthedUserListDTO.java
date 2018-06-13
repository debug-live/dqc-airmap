package biz.globalvillage.airmap.dto.device;

public class AuthedUserListDTO {

    private long userId;

    private String phone;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
