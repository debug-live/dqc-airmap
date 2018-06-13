package biz.globalvillage.tools.controller.classes;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.tools.dto.classes.ClassDetailDTO;
import biz.globalvillage.tools.dto.classes.ClassListDTO;
import biz.globalvillage.tools.param.classes.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tools/class")
public class ClassController {

    @PostMapping("/list")
    public Result<ClassListDTO> getClassList(ClassListParam param){
        ClassListDTO dto = new ClassListDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    @PostMapping("/detail")
    public Result<ClassDetailDTO> getClassDetail(ClassDetailParam param){
        ClassDetailDTO dto = new ClassDetailDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    @PostMapping("/add")
    public Result addClass(ClassAddParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/addDevice")
    public Result addClassDevice(ClassDeviceAddParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/removeDevice")
    public Result removeClassDevice(ClassDeviceRemoveParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/serviceTime/modify")
    public Result modifyServiceTime(ClassServiceTimeModifyParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

}
