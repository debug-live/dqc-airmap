package biz.globalvillage.oper.controller.factory;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.oper.dto.factory.*;
import biz.globalvillage.oper.param.dealer.SaveDealerParam;
import biz.globalvillage.oper.param.factory.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/factory")
public class FactoryController {

    @PostMapping("/save")
    public Result<Boolean> saveFactory(SaveDealerParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list")
    public Result<FactoryListDTO> getFactoryList(FactoryListParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result<FactoryDetialDTO> getFactoryDetail(FactoryDetailParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/lock")
    public Result<Boolean> lockFactory(FactoryDetailParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @Deprecated
    @PostMapping("/binders/list")
    public Result getFactoryBinderList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @Deprecated
    @PostMapping("/bindUser")
    public Result bindUser(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @Deprecated
    @PostMapping("/unbindUser")
    public Result unbindUser(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


    @PostMapping("/bindCompany")
    public Result<Boolean> bindCompany(BindCompanyParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/listCanBindCompanys")
    public Result<CanBindCompanyListDTO> listCanBindCompanys(CanBindCompanyListParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/listBoundCompanys")
    public Result<BoundCompanyListDTO> listBoundCompanys(BoundCompanyListParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/listBoundFactorys")
    public Result<BoundFactoryListDTO> listBoundFactorys(BoundFactoryListParam param){
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
    public Result openDeviceSnForFetch(DeviceSnForFetchParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 工厂用户登录后台—>生产批次—>找到某个具体设备->重置出厂身份
     *
     *
     */
    @PostMapping("/resetDeviceSnForFetch")
    public Result resetDeviceSnForFetch(DeviceSnForFetchParam para){
        return ResponseUtil.setDefaultSuccessResponse();
    }


}
