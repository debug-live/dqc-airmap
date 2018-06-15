package biz.globalvillage.oper.controller.net;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.common.entity.net.NetBroker;
import biz.globalvillage.oper.dto.net.NetBrokerListDTO;
import biz.globalvillage.oper.dto.net.NetListDTO;
import biz.globalvillage.oper.param.net.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/oper/net/broker")
public class NetBrokerController {

    @PostMapping("/save")
    public Result saveNetBroker(NetBroker netBroker){
        return ResponseUtil.setDefaultErrResponse();
    }

    @PostMapping("/list")
    public Result<List<NetBrokerListDTO>> getNetBrokerList(NetBrokerListParam param){
        List<NetBrokerListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    @PostMapping("/detail")
    public Result getNetBrokerDetail(NetBroker param){
        NetBroker netBroker = new NetBroker();
        return ResponseUtil.setSuccessDataResponse(netBroker);
    }

    @PostMapping("/bindNet")
    public Result bindNet(NetBrokerRelAddParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/unbindNet")
    public Result unbindNet(NetBrokerRelDelParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/bindedNet/list")
    public Result<List<NetListDTO>> getBindedNetList(NetBindedListParam param){
        List<NetListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    @PostMapping("/unbindedNet/list")
    public Result<List<NetListDTO>> getUnBindedNetList(NetUnbindListParam param){
        List<NetListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }
}
