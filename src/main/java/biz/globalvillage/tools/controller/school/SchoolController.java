package biz.globalvillage.tools.controller.school;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tools/school")
public class SchoolController {

    @PostMapping("/list")
    public Result getSchoolList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/add")
    public Result addSchool(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/grade/list")
    public Result getGradeList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

}