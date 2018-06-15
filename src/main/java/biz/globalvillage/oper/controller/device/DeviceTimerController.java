package biz.globalvillage.oper.controller.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.oper.dto.device.timer.DeviceTimerDetailDTO;
import biz.globalvillage.oper.dto.device.timer.DeviceTimerListDTO;
import biz.globalvillage.oper.param.device.timer.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * 之前的定时器功能存在bug，一个班级多个设备，定时器sn不一致，导致定时器删不尽
 */
@RestController
@RequestMapping("/oper/device/timer")
public class DeviceTimerController {

    @PostMapping("/list")
    public Result<List<DeviceTimerListDTO>> getDeviceTimerList(DeviceTimerListParam param){
        List<DeviceTimerListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    @PostMapping("/add")
    public Result addDeviceTimer(DeviceTimerAddParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/modify")
    public Result modifyDeviceTimer(DeviceTimerModifyParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/del")
    public Result delDeviceTimer(DeviceTimerDelParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result<DeviceTimerDetailDTO> getDeviceDetail(DeviceTimerDetailParam param){
        DeviceTimerDetailDTO dto = new DeviceTimerDetailDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }



    /**
     * 品牌商后台->校园新风->设备管理->清除定时器
     *
     * 删除设备全部的定时器（）
     *
     */
    @PostMapping("/delAllTimerByDeviceId")
    public Result delAllTimerByDeviceId(DeviceTimeDelAllParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
