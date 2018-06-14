package biz.globalvillage.oper.controller.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.oper.dto.device.*;
import biz.globalvillage.oper.param.device.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/oper/device")
public class DeviceController {

    /**
     * 设备列表
     * @return
     */
    @PostMapping("/list")
    public Result<List<DeviceListDTO>> getDeviceList(DeviceListParam param){
        List<DeviceListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    @PostMapping("/detail")
    public Result<DeviceDetailDTO> getDeviceDetail(DeviceDetailParam param){
        DeviceDetailDTO dto = new DeviceDetailDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    /**
     * 设备回收
     * @return
     */
    @PostMapping("/recycle")
    public Result recycleDevice(DeviceRecycleParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }


    @PostMapping("/clearAddress")
    public Result clearDeviceAddress(DeviceAddrClearParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/manualFillLoction")
    public Result manualFillLocation(DeviceLocFillParam param){
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
    public Result<DeviceMgrUserDTO> getMgrPhoneBySn(DeviceMgrUserGetParam param){
        DeviceMgrUserDTO dto = new DeviceMgrUserDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    /**
     * 位置维护列表（有冗余嫌疑）
     * @return
     */
    @PostMapping("/geo/list")
    public Result<List<DeviceGeoListDTO>> getDeviceGeoList(DeviceListForGeoParam param){
        List<DeviceGeoListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    /**
     * 获取激活的设备列表（有冗余嫌疑）
     * @return
     */
    @PostMapping("/actived/list")
    public Result<List<DeviceActivedListDTO>> getActivedDeviceList(DeviceActivedListParam param){
        List<DeviceActivedListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    /**
     * 固件页面的设备列表（有冗余嫌疑）
     * @return
     */
    @PostMapping("/listForMcu")
    public Result<List<DeviceListForMcuDTO>> getDeviceListForMcu(DeviceListForMcuParam param){
        List<DeviceListForMcuDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    /**
     * 设备管理->设备用户
     * @return
     */
    @PostMapping("/listUsers")
    public Result<List<DeviceUserListDTO>> getDeviceUserList(DeviceUserListParam param){
        List<DeviceUserListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    /**
     * 工厂后台->生产批次->复核激活设备
     *
     * 工厂有的设备可能没有激活成功
     *
     * 这个接口不能用json
     */
    @PostMapping("/checkActive")
    public Result checkDeviceActive(DeviceActiveCheckParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }


    /**
     * 品牌商后台->生产管理->设备批次->清除出厂地址
     *
     */
    @PostMapping("/clearFactoryAddress")
    public Result clearFactoryAddress(DeviceFactoryAddrClearParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 设备列表->返厂
     *
     */
    @PostMapping("/returnFactory")
    public Result returnFactory(DeviceReturnFactoryParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 设备列表->设备授权（此接口和app端的设备授权一样，有冗余的嫌疑）
     *
     */
    @PostMapping("/authToUser")
    public Result authToUser(DeviceAuthToUserParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }


}
