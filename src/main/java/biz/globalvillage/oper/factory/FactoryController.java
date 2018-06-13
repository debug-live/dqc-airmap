package biz.globalvillage.oper.factory;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/factory")
public class FactoryController {

    @PostMapping("/save")
    public Result saveFactory(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list")
    public Result getFactoryList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result getFactoryDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/lock")
    public Result lockFactory(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/binders/list")
    public Result getFactoryBinderList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/bindUser")
    public Result bindUser(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/unbindUser")
    public Result unbindUser(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


    @PostMapping("/bindCompany")
    public Result bindCompany(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/listCanBindCompanys")
    public Result listCanBindCompanys(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/listBindedCompanys")
    public Result listBindedCompanys(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/listBindedFactorys")
    public Result listBindedFactorys(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 工厂用户登录后台—>生产批次—>找到某个具体设备->在线测试
     * 这个在线的MQTT测试需要获取MQTT账号（应该合并到common的getMqttAccount里）
     *
     */
    @PostMapping("/getMqttAccount")
    public Result getMqttAccount(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 工厂用户登录后台—>生产批次—>找到某个具体设备->设置出厂身份
     *
     * sn打开后，可以被设备获取、烧录
     */
    @PostMapping("/openDeviceSnForFetch")
    public Result openDeviceSnForFetch(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 工厂用户登录后台—>生产批次—>找到某个具体设备->重置出厂身份
     *
     *
     */
    @PostMapping("/resetDeviceSnForFetch")
    public Result resetDeviceSnForFetch(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


}
