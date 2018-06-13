package biz.globalvillage.tools.controller.school;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.common.entity.school.Grade;
import biz.globalvillage.tools.dto.school.SchoolListDTO;
import biz.globalvillage.tools.param.school.SchoolAddParam;
import biz.globalvillage.tools.param.school.SchoolListParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tools/school")
public class SchoolController {

    @PostMapping("/list")
    public Result getSchoolList(SchoolListParam param){
        List<SchoolListDTO> dtos = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(dtos);
    }

    @PostMapping("/add")
    public Result addSchool(SchoolAddParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/grade/list")
    public Result<List<Grade>> getGradeList(){
        List<Grade> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

}