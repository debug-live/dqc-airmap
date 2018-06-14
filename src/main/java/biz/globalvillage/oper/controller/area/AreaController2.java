package biz.globalvillage.oper.controller.area;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/area")
public class AreaController2 {

    /**
     * 这个接口本质上tools里的getAreaByParentId是完全一样的
     */
    @PostMapping("/children")
    public Result getAreaChildren(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


    /**
     * 我的运营->设备分布情况->定位地图用
     */
    @PostMapping("/getLatAndLngByAreaCode")
    public Result getLatAndLngByAreaCode(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
