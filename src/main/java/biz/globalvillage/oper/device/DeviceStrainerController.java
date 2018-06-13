package biz.globalvillage.oper.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/device/strainer")
public class DeviceStrainerController {

    @PostMapping("/list")
    public Result getDeviceStrainerList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result getDeviceStrainerDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
