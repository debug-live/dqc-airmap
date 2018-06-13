package biz.globalvillage.tools.controller.area;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.common.entity.area.Area;
import biz.globalvillage.tools.param.area.AreaIdParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tools/area")
public class AreaController1 {

    @PostMapping("/getAreaByParentId")
    public Result<Area> getAreaByParentId(AreaIdParam param){
        Area area = new Area();
        return ResponseUtil.setSuccessDataResponse(area);
    }

}
