package biz.globalvillage.oper.controller.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.common.entity.device.mcu.DeviceMcu;
import biz.globalvillage.oper.dto.device.mcu.DeviceMcuDetailDTO;
import biz.globalvillage.oper.dto.device.mcu.DeviceMcuListDTO;
import biz.globalvillage.oper.param.device.mcu.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/oper/device/mcu")
public class DeviceMcuController {

    @PostMapping("/list")
    public Result<List<DeviceMcuListDTO>> getMcuList(DeviceMcuListParam param){
        List<DeviceMcuListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    @PostMapping("/save")
    public Result saveMcu(DeviceMcu param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/del")
    public Result delMcu(DeviceMcuDelParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result<DeviceMcuDetailDTO> getMcuDetail(DeviceMcuDetailParam param){
        DeviceMcuDetailDTO dto = new DeviceMcuDetailDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    @PostMapping("/update")
    public Result update(DeviceMcuUpdateParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }


}
