package biz.globalvillage.oper.controller.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.common.entity.device.batch.DeviceBatch;
import biz.globalvillage.common.entity.device.category.DeviceCategory;
import biz.globalvillage.oper.dto.device.batch.DeviceBatchDetailDTO;
import biz.globalvillage.oper.dto.device.batch.DeviceBatchListDTO;
import biz.globalvillage.oper.dto.device.batch.DeviceBatchSnListDTO;
import biz.globalvillage.oper.param.device.batch.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/oper/device/batch")
public class DeviceBatchController {

    @PostMapping("/create")
    public Result createDeviceBatch(DeviceBatch deviceBatch){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list")
    public Result<List<DeviceBatchListDTO>> getDeviceBatchList(DeviceBatchListParam param){
        List<DeviceBatchListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    @PostMapping("/detail")
    public Result<DeviceBatchDetailDTO> getDeviceBatchDetail(DeviceBatchDetailParam param){
        DeviceBatchDetailDTO dto = new DeviceBatchDetailDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    @PostMapping("/sn/list")
    public Result<List<DeviceBatchSnListDTO>> listSn(DeviceBatchSnListParam param){
        List<DeviceBatchSnListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    @PostMapping("/discardSn")
    public Result discardSn(DeviceSnDiscardParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/export")
    public Result exportDeviceBatch(DeviceBatchExportParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
