package biz.globalvillage.airmap.controller.air;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airmap/air")
public class AirController {

    @PostMapping("/getCityAirByCityCode")
    public Result getCityAirByCityCode(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/getLocalAirAndWeather")
    public Result getLocalAirAndWeather(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/getWeatherPredict")
    public Result getWeatherPredict(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
