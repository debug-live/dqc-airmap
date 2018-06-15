package biz.globalvillage.oper.dto.statistics;

import java.util.List;

public class DeviceGisViewDTO {

    private List<GisLatAndLng> deviceList;

    private List<GisLatAndLng> districtList;

    private List<GisLatAndLng> cityList;

    public List<GisLatAndLng> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(List<GisLatAndLng> deviceList) {
        this.deviceList = deviceList;
    }

    public List<GisLatAndLng> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<GisLatAndLng> districtList) {
        this.districtList = districtList;
    }

    public List<GisLatAndLng> getCityList() {
        return cityList;
    }

    public void setCityList(List<GisLatAndLng> cityList) {
        this.cityList = cityList;
    }

    class GisLatAndLng {

        private String name;

        private double lat;

        private double lng;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }
    }
}
