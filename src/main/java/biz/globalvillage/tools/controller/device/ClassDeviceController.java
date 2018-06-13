package biz.globalvillage.tools.controller.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tools/class/device")
public class ClassDeviceController {

    @PostMapping("/changeStrainer")
    public Result changeStrainer(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
