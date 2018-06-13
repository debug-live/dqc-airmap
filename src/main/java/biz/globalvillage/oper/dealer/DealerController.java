package biz.globalvillage.oper.dealer;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/dealer")
public class DealerController {

    @PostMapping("/save")
    public Result saveDealer(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list")
    public Result getDealerList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result getDealerDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/lock")
    public Result lockDealer(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 此接口用于整体运营中，地图的定位
     *
     */
    @PostMapping("/getLatAndLng")
    public Result getDealerLatAndLng(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 此接口用于后台提交订单，选择经销商时，通过输入电话号码找到经销商
     * @return
     */
    @PostMapping("/find/by/phone")
    public Result getDealerByPhone(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


}
