package biz.globalvillage.oper.controller.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/device/statistics")
public class DeviceStatisticsController {

    /**
     * 设备管理->联网统计—>最上面的统计数据
     * @return
     */
    @PostMapping("/getConnReport")
    public Result getDeviceConnReport(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 设备地图->全国在线设备—>在线设备数
     * @return
     */
    @PostMapping("/getAllGisDev/onlineCount")
    public Result getAllGisDevOnlineCount(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 设备地图->全国在线设备—>在线设备分布点
     * @return
     */
    @PostMapping("/getAllGisDev/view")
    public Result getAllGisDevView(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 设备地图->全国设备分布图
     * @return
     */
    @PostMapping("/distributionByProvince")
    public Result getDeviceDistrbutionByProvince(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 设备地图->设备总数、已使用设备、在线设备、离线设备的统计
     * @return
     */
    @PostMapping("/generalCount")
    public Result generalCount(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
