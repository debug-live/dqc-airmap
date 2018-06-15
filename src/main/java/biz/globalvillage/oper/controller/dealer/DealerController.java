package biz.globalvillage.oper.controller.dealer;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.oper.dto.dealer.DealerByPhoneDTO;
import biz.globalvillage.oper.dto.dealer.DealerDetailDTO;
import biz.globalvillage.oper.dto.dealer.DealerLatAndLngDTO;
import biz.globalvillage.oper.dto.dealer.DealerListDTO;
import biz.globalvillage.oper.param.dealer.DealerDeatailParam;
import biz.globalvillage.oper.param.dealer.DealerListParam;
import biz.globalvillage.oper.param.dealer.DealerLockParam;
import biz.globalvillage.oper.param.dealer.SaveDealerParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/oper/dealer")
public class DealerController {

    @PostMapping("/save")
    public Result<Boolean> saveDealer(SaveDealerParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list")
    public Result<List<DealerListDTO>> getDealerList(DealerListParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result<DealerDetailDTO> getDealerDetail(DealerDeatailParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/lock")
    public Result<Boolean> lockDealer(DealerLockParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 此接口用于整体运营中，地图的定位
     *
     */
    @PostMapping("/getLatAndLng")
    public Result<DealerLatAndLngDTO> getDealerLatAndLng(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 此接口用于后台提交订单，选择经销商时，通过输入电话号码找到经销商
     * @return
     */
    @PostMapping("/find/by/phone")
    public Result<DealerByPhoneDTO> getDealerByPhone(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


}
