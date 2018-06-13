package biz.globalvillage.oper.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/device")
public class DeviceController {

    /**
     * 设备列表
     * @return
     */
    @PostMapping("/list")
    public Result getDeviceList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result getDeviceDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 设备回收
     * @return
     */
    @PostMapping("/recycle")
    public Result recycleDevice(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


    @PostMapping("/clearAddress")
    public Result clearDeviceAddress(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/manualFillLoction")
    public Result manualFillLocation(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


    /**
     * 获取设备主控用户的手机
     * 位置维护—>找到没有地址的设备->手动更新
     *
     * 通过该接口找到主控用户的手机号，页面调用第三方接口，显示手机归属地，用于手动更新设备地址的参考
     * @return
     */
    @PostMapping("/getMgrPhoneBySn")
    public Result getMgrPhoneBySn(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 位置维护列表（有冗余嫌疑）
     * @return
     */
    @PostMapping("/geo/list")
    public Result getDeviceGeoList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 获取激活的设备列表（有冗余嫌疑）
     * @return
     */
    @PostMapping("/actived/list")
    public Result getActivedDeviceList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 固件页面的设备列表（有冗余嫌疑）
     * @return
     */
    @PostMapping("/listForMcu")
    public Result getDeviceListForMcu(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 设备管理->设备用户
     * @return
     */
    @PostMapping("/listUsers")
    public Result getDeviceUserList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 工厂后台->生产批次->复核激活设备
     *
     * 工厂有的设备可能没有激活成功
     */
    @PostMapping("/checkActive")
    public Result checkDeviceActive(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


    /**
     * 品牌商后台->生产管理->设备批次->清除出厂地址
     *
     */
    @PostMapping("/clearFactoryAddress")
    public Result clearFactoryAddress(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 设备列表->返厂
     *
     */
    @PostMapping("/returnFactory")
    public Result returnFactory(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 设备列表->设备授权（此接口和app端的设备授权一样，有冗余的嫌疑）
     *
     */
    @PostMapping("/authToUser")
    public Result authToUser(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


}
