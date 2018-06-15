package biz.globalvillage.oper.controller.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.oper.dto.statistics.*;
import biz.globalvillage.oper.param.device.statistics.*;
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
    public Result getDeviceConnReport(DeviceConnReportParam param){
        DeviceConnReportDTO dto = new DeviceConnReportDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    /**
     * 设备地图->全国在线设备—>在线设备数
     * @return
     */
    @PostMapping("/getAllGisDev/onlineCount")
    public Result getAllGisDevOnlineCount(){
        DeviceGisOnlineDTO dto = new DeviceGisOnlineDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    /**
     * 设备地图->全国在线设备—>在线设备分布点
     * @return
     */
    @PostMapping("/getAllGisDev/view")
    public Result getAllGisDevView(){
        DeviceGisViewDTO dto = new DeviceGisViewDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    /**
     * 设备地图->全国设备分布图
     * @return
     */
    @PostMapping("/distributionByProvince")
    public Result getDeviceDistrbutionByProvince(){
        DeviceDistribByProvinceDTO dto = new DeviceDistribByProvinceDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    /**
     * 设备地图->设备总数、已使用设备、在线设备、离线设备的统计
     * @return
     */
    @PostMapping("/generalCount")
    public Result generalCount(){
        DeviceGeneralCountDTO dto = new DeviceGeneralCountDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }
}
