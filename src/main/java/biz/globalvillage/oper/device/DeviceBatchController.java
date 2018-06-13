package biz.globalvillage.oper.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/device/batch")
public class DeviceBatchController {

    @PostMapping("/create")
    public Result createDeviceBatch(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list")
    public Result getDeviceBatchList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result getDeviceBatchDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/sn/list")
    public Result listSn(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/discardSn")
    public Result discardSn(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/export")
    public Result exportDeviceBatch(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
