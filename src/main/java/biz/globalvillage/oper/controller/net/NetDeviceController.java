package biz.globalvillage.oper.controller.net;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.common.entity.net.NetDeviceRel;
import biz.globalvillage.oper.dto.net.NetAllDeviceListDTO;
import biz.globalvillage.oper.dto.net.NetDeviceListDTO;
import biz.globalvillage.oper.param.net.NetAllDeviceListParam;
import biz.globalvillage.oper.param.net.NetDeviceAddParam;
import biz.globalvillage.oper.param.net.NetDeviceListParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/oper/net/device")
public class NetDeviceController {

    /**
     * 网点管理->网点列表->设备列表
     *
     * 看的是一个网点下的设备列表
     */
    @PostMapping("/list")
    public Result<List<NetDeviceListDTO>> getNetDeviceList(NetDeviceListParam param){
        List<NetDeviceListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    @PostMapping("/add")
    public Result addNetDevice(NetDeviceAddParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/remove")
    public Result removeNetDevice(NetDeviceRel param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 网点管理->设备列表
     *
     * 看经销商旗下所有网点的设备列表
     */
    @PostMapping("/list/all")
    public Result<List<NetAllDeviceListDTO>> getAllNetDeviceList(NetAllDeviceListParam param){
        List<NetAllDeviceListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }
}
