package biz.globalvillage.oper.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/device/model")
public class DeviceModelController {

    @PostMapping("/save")
    public Result saveDeviceModel(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list")
    public Result getDeviceModelList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 没有分页，用于下拉列表，此接口有冗余的嫌疑
     * @return
     */
    @PostMapping("/findByCategory")
    public Result getDeviceModelListByCategory(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 获取排除设备分类的设备型号列表
     * @return
     */
    @PostMapping("/listExculdeStrainer")
    public Result getDeviceModelListExculdeStrainer(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

}
