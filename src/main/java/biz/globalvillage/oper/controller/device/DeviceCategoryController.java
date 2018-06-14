package biz.globalvillage.oper.controller.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.common.entity.device.category.DeviceCategory;
import biz.globalvillage.oper.param.device.category.DeviceCategoryListParam;
import biz.globalvillage.oper.param.device.category.DeviceCategorySaveParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/oper/device/category")
public class DeviceCategoryController {

    @PostMapping("/save")
    public Result saveDeviceCategory(DeviceCategorySaveParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list")
    public Result<List<DeviceCategory>> getDeviceCategoryList(DeviceCategoryListParam param){
        List<DeviceCategory> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

}
