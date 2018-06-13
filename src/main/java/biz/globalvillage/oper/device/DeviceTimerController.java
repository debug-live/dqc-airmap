package biz.globalvillage.oper.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * 之前的定时器功能存在bug，一个班级多个设备，定时器sn不一致，导致定时器删不尽
 */
@RestController
@RequestMapping("/oper/device/timer")
public class DeviceTimerController {

    @PostMapping("/list")
    public Result getDeviceTimerList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/add")
    public Result addDeviceTimer(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/modify")
    public Result modifyDeviceTimer(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/del")
    public Result delDeviceTimer(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result getDeviceDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }



    /**
     * 品牌商后台->校园新风->设备管理->清除定时器
     *
     * 删除设备全部的定时器（）
     *
     */
    @PostMapping("/delAllTimerByDeviceId")
    public Result delAllTimerByDeviceId(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
