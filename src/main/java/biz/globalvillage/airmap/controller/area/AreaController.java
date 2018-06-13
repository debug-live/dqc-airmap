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
        Area area = new Area();
        return ResponseUtil.setSuccessDataResponse(area);
    }
}
