package biz.globalvillage.oper.school;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/school")
public class SchoolController2 {

    @PostMapping("/list")
    public Result getSchoolList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result getSchoolDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/save")
    public Result saveSchool(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/grade/list")
    public Result getGradeList(){
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
    public Result openService(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 学校后台—班级监控—获取学校实况班级设备列表
     * @return
     */
    @PostMapping("/live/device/list")
    public Result getSchoolLiveDeviceList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 学校后台—班级监控—获取学校实况班级设备概况（上面的一排）
     * @return
     */
    @PostMapping("/live/device/general")
    public Result getSchoolLiveDeviceGeneral(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
