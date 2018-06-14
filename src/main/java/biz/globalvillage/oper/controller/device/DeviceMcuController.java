package biz.globalvillage.oper.controller.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.oper.param.device.mcu.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/device/mcu")
public class DeviceMcuController {

    @PostMapping("/list")
    public Result getMcuList(DeviceMcuListParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/save")
    public Result saveMcu(DeviceMcuSaveParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/del")
    public Result delMcu(DeviceMcuDelParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/get")
    public Result getMcu(DeviceMcuGetParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/update")
    public Result update(DeviceMcuUpdateParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }


}
