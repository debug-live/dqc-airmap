package biz.globalvillage.oper.controller.school;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.oper.dto.school.DetailByCurrentUserDTO;
import biz.globalvillage.oper.dto.school.EduDetailDTO;
import biz.globalvillage.oper.dto.school.EduListDTO;
import biz.globalvillage.oper.dto.school.EduSchoolListDTO;
import biz.globalvillage.oper.param.school.EduDetialParam;
import biz.globalvillage.oper.param.school.EduListParam;
import biz.globalvillage.oper.param.school.EduSchoolListParam;
import biz.globalvillage.oper.param.school.SaveEduParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/oper/edu")
public class EduController {

    @PostMapping("/list")
    public Result<List<EduListDTO>> getEduList(EduListParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result<EduDetailDTO> getEduDetail(EduDetialParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/save")
    public Result<Boolean> saveEdu(SaveEduParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/school/list")
    public Result<List<EduSchoolListDTO>> getEduSchoolList(EduSchoolListParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 教育局后台->辖区学校->学校列表页面->xxx教育局
     *
     * 为了在这个页面显示xxx教育局而存在
     */
    @PostMapping("/getDetailByCurrentUser")
    public Result<DetailByCurrentUserDTO> getDetailByCurrentUser(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

}
