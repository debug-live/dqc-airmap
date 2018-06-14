package biz.globalvillage.oper.controller.net;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/net/device")
public class NetDeviceController {

    /**
     * 网点管理->网点列表->设备列表
     *
     * 看的是一个网点下的设备列表
     */
    @PostMapping("/list")
    public Result getNetDeviceList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/add")
    public Result addNetDevice(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/remove")
    public Result removeNetDevice(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 网点管理->设备列表
     *
     * 看经销商旗下所有网点的设备列表
     */
    @PostMapping("/list/all")
    public Result getAllNetDeviceList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
