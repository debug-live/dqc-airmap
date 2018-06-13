package biz.globalvillage.airmap.controller.air;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.dto.air.CityWeatherDTO;
import biz.globalvillage.airmap.param.air.GetWeatherByAreaCodeParam;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airmap/air")
public class AirController {

    /**
     * 首页天气
     *
     */
    @PostMapping("/getCityWeatherByCityCode")
    public Result getCityAirByCityCode(GetWeatherByAreaCodeParam param){
        CityWeatherDTO dto = new CityWeatherDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    @Deprecated
    @PostMapping("/getLocalAirAndWeather")
    public Result getLocalAirAndWeather(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 根据现有业务，和getCityWeatherByCityCode合并
     */
    @Deprecated
    @PostMapping("/getWeatherPredict")
    public Result getWeatherPredict(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
