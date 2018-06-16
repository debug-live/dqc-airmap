package biz.globalvillage.oper.controller.school;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.oper.dto.school.ClassListDTO;
import biz.globalvillage.oper.dto.school.ClassDetailDTO;
import biz.globalvillage.oper.dto.school.FollowerListDTO;
import biz.globalvillage.oper.param.school.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/oper/classes")
public class ClassController2 {

    @PostMapping("/list")
    public Result<List<ClassListDTO>> getClassList(ClassListParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result<ClassDetailDTO> getClassDetail(ClassDetailParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/save")
    public Result<Boolean> saveClass(SaveClassParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/del")
    public Result delClass(long classId){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/service/open")
    public Result<Boolean> openService(ClassOpenServiceParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/follower/list")
    public Result<FollowerListDTO> getFollowerList(FollowerListParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/serviceTime/modify")
    public Result modifyServiceTime(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
