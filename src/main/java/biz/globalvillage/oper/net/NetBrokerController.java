package biz.globalvillage.oper.net;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/net/broker")
public class NetBrokerController {

    @PostMapping("/save")
    public Result saveNetBroker(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list")
    public Result getNetBrokerList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result getNetBrokerDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/bindNet")
    public Result bindNet(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/unbindNet")
    public Result unbindNet(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/bindedNet/list")
    public Result getBindedNetList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/unbindedNet/list")
    public Result getUnBindedNetList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
