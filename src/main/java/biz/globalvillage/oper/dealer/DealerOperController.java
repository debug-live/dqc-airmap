package biz.globalvillage.oper.dealer;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/dealer/oper")
public class DealerOperController {

    /**
     * 我的运营->整体运营->最上面的统计（设备总数、新风机、空气复原机）
     *
     */
    @PostMapping("/device/total/count")
    public Result countDeviceTotal(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 我的运营->整体运营->最下面的统计（离线总数、在线开机、关机）
     *
     */
    @PostMapping("/onoff/device/nums/count")
    public Result countDeviceOnOffLinesNums(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 我的运营->整体运营->中间左侧的设备分布图
     *
     */
    @PostMapping("/device/distribute")
    public Result deviceDistribute(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 我的运营->整体运营->右上角的设备增长趋势
     *
     * 我的运营->设备增长趋势
     *
     */
    @PostMapping("/deviceNum/incres")
    public Result deviceNumIncres(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 我的运营->整体运营->右下角的设备耗材图
     *
     */
    @PostMapping("/strainer/cost/view")
    public Result strainerCostView(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 我的运营->设备分布情况->最下面的设备统计列表（按型号）
     *
     */
    @PostMapping("/countDeviceNumsWithModel")
    public Result countDeviceNumsWithModel(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 我的运营->耗材寿命分布->分布列表
     *
     */
    @PostMapping("/strainer/cost/list")
    public Result strainerCostList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 我的运营->耗材寿命分布->分布列表->点击设备耗材数量
     *
     */
    @PostMapping("/strainer/cost/detail")
    public Result strainerCostDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


}
