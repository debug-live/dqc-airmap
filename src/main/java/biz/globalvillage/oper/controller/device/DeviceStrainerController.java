package biz.globalvillage.oper.controller.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.oper.dto.device.strainer.StrainerDetailDTO;
import biz.globalvillage.oper.dto.device.strainer.StrainerListDTO;
import biz.globalvillage.oper.param.device.strainer.StrainerDetailParam;
import biz.globalvillage.oper.param.device.strainer.StrainerListParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/oper/device/strainer")
public class DeviceStrainerController {

    @PostMapping("/list")
    public Result<List<StrainerListDTO>> getDeviceStrainerList(StrainerListParam param){
        ArrayList<StrainerListDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    @PostMapping("/detail")
    public Result<StrainerDetailDTO> getDeviceStrainerDetail(StrainerDetailParam param){
        StrainerDetailDTO dto = new StrainerDetailDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }
}
