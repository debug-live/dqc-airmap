package biz.globalvillage.oper.school;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/edu")
public class EduController {

    @PostMapping("/list")
    public Result getEduList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result getEduDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/save")
    public Result saveEdu(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/school/list")
    public Result getEduSchoolList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 教育局后台->辖区学校->学校列表页面->xxx教育局
     *
     * 为了在这个页面显示xxx教育局而存在
     */
    @PostMapping("/getDetailByCurrentUser")
    public Result getDetailByCurrentUser(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

}
