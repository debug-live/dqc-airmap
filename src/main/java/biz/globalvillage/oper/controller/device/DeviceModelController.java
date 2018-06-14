package biz.globalvillage.oper.controller.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.common.entity.device.model.DeviceModel;
import biz.globalvillage.oper.dto.device.model.DeviceModelListDTO;
import biz.globalvillage.oper.param.device.model.DeviceModelFindByCategoryParam;
import biz.globalvillage.oper.param.device.model.DeviceModelListParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/oper/device/model")
public class DeviceModelController {

    @PostMapping("/save")
    public Result saveDeviceModel(DeviceModel param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list")
    public Result<List<DeviceModelListDTO>> getDeviceModelList(DeviceModelListParam param){
        List<DeviceModelListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    /**
     * 没有分页，用于下拉列表，此接口有冗余的嫌疑
     * @return
     */
    @PostMapping("/findByCategory")
    public Result<List<DeviceModelListDTO>> getDeviceModelListByCategory(DeviceModelFindByCategoryParam param){
        List<DeviceModelListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    /**
     * 获取排除设备分类的设备型号列表
     * @return
     */
    @PostMapping("/listExculdeStrainer")
    public Result<List<DeviceModelListDTO>> getDeviceModelListExculdeStrainer(){
        List<DeviceModelListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

}
