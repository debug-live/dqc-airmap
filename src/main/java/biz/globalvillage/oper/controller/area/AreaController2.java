package biz.globalvillage.oper.controller.area;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.oper.dto.area.AreaChildrenDTO;
import biz.globalvillage.oper.dto.area.LatLngDTO;
import biz.globalvillage.oper.param.area.AreaChildrenParam;
import biz.globalvillage.oper.param.area.AreaCodeParam;
import biz.globalvillage.tools.param.area.AreaIdParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/area")
public class AreaController2 {

    /**
     * 这个接口本质上tools里的getAreaByParentId是完全一样的
     */
    @PostMapping("/children")
    public Result<AreaChildrenDTO> getAreaChildren(AreaChildrenParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }


    /**
     * 我的运营->设备分布情况->定位地图用
     */
    @PostMapping("/getLatAndLngByAreaCode")
    public Result<LatLngDTO> getLatAndLngByAreaCode(AreaCodeParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
