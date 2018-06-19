package biz.globalvillage.airmap.controller.area;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.common.entity.area.Area;
import biz.globalvillage.airmap.param.area.GetAreaByLatAndLngParam;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airmap/area")
public class AreaController {

    @PostMapping("/getByLatAndLng")
    public Result getAreaByLatAndLng(GetAreaByLatAndLngParam param){
        /**
         * 根据经纬度获取地区代码
         * 1.调用高德接口获取相应的地区代码
         *
         * 问题：如果行政地区编码已经发生变更，该如何处理？
         * 目前的做法是，创建新的地区行政编码
         */
        Area area = new Area();
        return ResponseUtil.setSuccessDataResponse(area);
    }
}
