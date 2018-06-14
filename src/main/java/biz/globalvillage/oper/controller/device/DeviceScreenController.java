package biz.globalvillage.oper.controller.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.oper.dto.device.sreen.PageIdDTO;
import biz.globalvillage.oper.dto.device.sreen.PageIdGerResultDTO;
import biz.globalvillage.oper.param.device.screen.PageIdParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/device/screen")
public class DeviceScreenController {


    @PostMapping("/pageId/get")
    public Result<PageIdDTO> getPageId(){
        PageIdDTO dto = new PageIdDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }


    @PostMapping("/bind/result/get")
    public Result getBindResult(PageIdParam param){
        PageIdGerResultDTO dto = new PageIdGerResultDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
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
