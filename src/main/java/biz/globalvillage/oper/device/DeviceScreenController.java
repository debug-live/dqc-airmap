package biz.globalvillage.oper.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/device/screen")
public class DeviceScreenController {


    @PostMapping("/pageId/get")
    public Result getPageId(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


    @PostMapping("/bind/result/get")
    public Result getBindResult(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


    /**
     * 严重雷同的接口，考虑合并
     * @return
     */
    @PostMapping("/connect/state/get")
    public Result getDeviceConnectState(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 严重雷同的接口，考虑合并
     * @return
     */
    @PostMapping("/mqtt/account/get")
    public Result getMqttAccount(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 严重雷同的接口，考虑合并
     * @return
     */
    @PostMapping("/outdoor/air/get")
    public Result getOutdoorAir(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 严重雷同的接口，考虑合并
     * @return
     */
    @PostMapping("/air/rank/get")
    public Result getAirRank(){
        return ResponseUtil.setDefaultSuccessResponse();
    }



}
