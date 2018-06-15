package biz.globalvillage.oper.controller.net;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.oper.dto.net.NetOrderDetailDTO;
import biz.globalvillage.oper.dto.net.NetOrderListDTO;
import biz.globalvillage.oper.dto.net.NetOrderStatusDTO;
import biz.globalvillage.oper.param.net.NetOrderDetailParam;
import biz.globalvillage.oper.param.net.NetOrderListParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/oper/net/order")
public class NetOrderController {

    @PostMapping("/list")
    public Result getNetOrderList(NetOrderListParam param){
        List<NetOrderListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    @PostMapping("/detail")
    public Result getNetOrderDetail(NetOrderDetailParam param){
        NetOrderDetailDTO dto = new NetOrderDetailDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    @PostMapping("/status/list")
    public Result<List<NetOrderStatusDTO>> getNetOrderStatusList(){
        List<NetOrderStatusDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }
}
