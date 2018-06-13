package biz.globalvillage.oper.sale;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/order")
public class OrderController {

    @PostMapping("/add")
    public Result addOrder(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list")
    public Result getOrderList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result getOrderDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/channel/list")
    public Result getSaleChannelList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/template/download")
    public Result downloadOrderTemplate(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
