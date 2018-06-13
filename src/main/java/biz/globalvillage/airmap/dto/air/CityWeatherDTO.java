package biz.globalvillage.airmap.dto.air;

public class CityWeatherDTO {

    private String text;

    private String picCode;

    private int low;

    private int high;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPicCode() {
        return picCode;
    }

    public void setPicCode(String picCode) {
        this.picCode = picCode;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
