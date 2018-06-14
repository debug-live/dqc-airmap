package biz.globalvillage.oper.controller.air;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/air")
public class AirController2 {

    @PostMapping("/getAirRank")
    public Result getAirRank(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 所有的设备大屏幕里用到，用于展示设备所在地的室外空气质量(可以合并)
     * @return
     */
    @PostMapping("/getFullOutDoorAir")
    public Result getFullOutDoorAir(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 学校后台—>班级监控->右上角学校所在地的室外空气质量（可以合并）
     *
     * 获取学校室外天气质量
     */
    @PostMapping("/getSchoolAirOutdoor")
    public Result getSchoolAirOutdoor(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


    /**
     * 首页->获取学校、教育局、经销商、制造商、品牌商的室外天气和空气质量（可以合并）
     *
     *
     */
    @PostMapping("/getAirAndWeather")
    public Result getAirAndWeather(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 首页->获取色块地图
     *
     */
    @PostMapping("/getAllAirQuality")
    public Result getAllAirQuality(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


}
