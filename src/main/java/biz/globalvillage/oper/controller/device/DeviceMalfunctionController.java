package biz.globalvillage.oper.controller.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/device/malfunction")
public class DeviceMalfunctionController {

    @PostMapping("/list")
    public Result getMalfunctionList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     *  工厂用户登录后台—>生产批次—>找到某个具体设备->设备故障
     *
     *  获取最后一条激活前的故障记录，看看设备有没有故障
     */
    @PostMapping("/getLastInActiveRecord")
    public Result getLastInActiveRecord(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
