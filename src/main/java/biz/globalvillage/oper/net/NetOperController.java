package biz.globalvillage.oper.net;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/net/oper")
public class NetOperController {

    /**
     * 网点管理->运营概况->网点数量统计（按网点类型）
     *
     */
    @PostMapping("/countByType")
    public Result countNetByType(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 网点管理->运营概况->营销概况统计（按时间选择）
     *
     */
    @PostMapping("/salesGeneralCount")
    public Result salesGeneralCount(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 网点管理->网点列表->设备SN管理->头部的各项统计值（单个网点的设备总数、网点订单数等等，不包含在线、离线设备）
     *
     */
    @PostMapping("/total/view/one")
    public Result OneNetTotalView(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 网点管理->网点列表->设备SN管理->头部的各项统计值（单个网点的在线、离线设备统计）
     *
     *
     */
    @PostMapping("/device/onoffline/general/one")
    public Result getOneNetOnOffLineDeviceGeneral(){
        return ResponseUtil.setDefaultSuccessResponse();
    }



    /**
     * 网点管理->设备列表->头部的各项统计值（经销商旗下全部网点设备总数、网点订单数等等，不包含在线、离线设备）
     *
     * 网点管理->实时运营->头部的五项统计值
     */
    @PostMapping("/total/view/all")
    public Result AllNetTotalView(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 网点管理->网点列表->设备SN管理->头部的各项统计值（经销商旗下全部网点的在线、离线设备统计）
     *
     *
     */
    @PostMapping("/device/onoffline/general/all")
    public Result getAllNetOnOffLineDeviceGeneral(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     *
     * 网点管理->实时运营->过去30天网点增长曲线
     */
    @PostMapping("/netNum/incr")
    public Result netNumIncr(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     *
     * 网点管理->实时运营->过去30天网点设备数增长曲线
     */
    @PostMapping("/deviceNum/incr")
    public Result deviceNumIncr(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     *
     * 网点管理->实时运营->过去30天设备绑定数增长曲线
     */
    @PostMapping("/bindCount/incr")
    public Result bindCountIncr(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     *
     * 网点管理->实时运营->过去30天订单数量增长曲线
     */
    @PostMapping("/orderNum/incr")
    public Result orderNumIncr(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     *
     * 网点管理->实时运营->过去30天网点订单总金额增长曲线
     */
    @PostMapping("/orderAmount/incr")
    public Result orderAmountIncr(){
        return ResponseUtil.setDefaultSuccessResponse();
    }



}
