package biz.globalvillage.oper.controller.net;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/net/order")
public class NetOrderController {

    @PostMapping("/list")
    public Result getNetOrderList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result getNetOrderDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/status/list")
    public Result getNetOrderStatusList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
