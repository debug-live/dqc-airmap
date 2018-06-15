package biz.globalvillage.oper.controller.net;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.common.entity.net.Net;
import biz.globalvillage.oper.dto.net.NetDetailDTO;
import biz.globalvillage.oper.dto.net.NetListDTO;
import biz.globalvillage.oper.dto.net.NetTypeListDTO;
import biz.globalvillage.oper.param.net.NetDetailParam;
import biz.globalvillage.oper.param.net.NetListParam;
import biz.globalvillage.oper.param.net.NetLockParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/oper/net")
public class NetController {

    @PostMapping("/save")
    public Result saveNet(Net net){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list")
    public Result<List<NetListDTO>> getNetList(NetListParam param){
        List<NetListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    @PostMapping("/detail")
    public Result<NetDetailDTO> getNetDetail(NetDetailParam param){
        NetDetailDTO dto = new NetDetailDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    @PostMapping("/lock")
    public Result lockNet(NetLockParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/type/list")
    public Result<NetTypeListDTO> getNetTypeList(){
        NetTypeListDTO dto = new NetTypeListDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }
}
