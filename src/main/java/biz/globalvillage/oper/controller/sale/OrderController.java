package biz.globalvillage.oper.controller.sale;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.oper.dto.sale.DeviceListDTO;
import biz.globalvillage.oper.dto.sale.OrderDetailDTO;
import biz.globalvillage.oper.dto.sale.OrderListDTO;
import biz.globalvillage.oper.param.sale.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/oper/order")
public class OrderController {

    @PostMapping("/add")
    public Result<Boolean> addOrder(AddOrderParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list")
    public Result<List<OrderListDTO>> getOrderList(OrderListParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result<OrderDetailDTO> getOrderDetail(OrderDetailParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list/device")
    public Result<List<DeviceListDTO>> getOrderDeviceList(DeviceListParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/channel/list")
    public Result<List<ChannelListDTO>> getSaleChannelList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/template/download")
    public void downloadOrderTemplate(HttpServletResponse response){
    }
}
