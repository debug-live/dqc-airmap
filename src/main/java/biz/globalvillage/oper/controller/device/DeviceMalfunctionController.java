package biz.globalvillage.oper.controller.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.common.entity.device.malfunction.DeviceMalfunction;
import biz.globalvillage.oper.dto.device.malfunction.DeviceMalListDTO;
import biz.globalvillage.oper.param.device.batch.DeviceBatchListParam;
import biz.globalvillage.oper.param.device.malfunction.DeviceLastInActiveMalParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/oper/device/malfunction")
public class DeviceMalfunctionController {

    @PostMapping("/list")
    public Result<List<DeviceMalListDTO>> getMalfunctionList(DeviceBatchListParam param){
        List<DeviceMalListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    /**
     *  工厂用户登录后台—>生产批次—>找到某个具体设备->设备故障
     *
     *  获取最后一条激活前的故障记录，看看设备有没有故障
     */
    @PostMapping("/getLastInActiveRecord")
    public Result<DeviceMalfunction> getLastInActiveRecord(DeviceLastInActiveMalParam param){
        DeviceMalfunction malfunction = new DeviceMalfunction();
        return ResponseUtil.setSuccessDataResponse(malfunction);
    }
}
