package biz.globalvillage.oper.controller.school;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.oper.dto.school.*;
import biz.globalvillage.oper.param.school.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/oper/school")
public class SchoolController2 {

    @PostMapping("/list")
    public Result<List<SchoolListDTO>> getSchoolList(SchoolListParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result<SchoolDetailDTO> getSchoolDetail(SchoolDetailParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/save")
    public Result<Boolean> saveSchool(SaveSchoolParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/grade/list")
    public Result<List<GradeListDTO>> getGradeList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/device/list")
    public Result getSchoolDeviceList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/device/detail")
    public Result getSchoolDeviceDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/service/open")
    public Result openService(SchoolOpenServiceParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 学校后台—班级监控—获取学校实况班级设备列表
     * @return
     */
    @PostMapping("/live/device/list")
    public Result<List<SchoolLiveDeviceListDTO>> getSchoolLiveDeviceList(SchoolListParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 学校后台—班级监控—获取学校实况班级设备概况（上面的一排）
     * @return
     */
    @PostMapping("/live/device/general")
    public Result<SchoolLiveDeviceGeneralDTO> getSchoolLiveDeviceGeneral(SchoolLiveDeviceGeneralParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
