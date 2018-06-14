package biz.globalvillage.oper.controller.school;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/classes")
public class ClassController2 {

    @PostMapping("/list")
    public Result getClassList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result getClassDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/save")
    public Result saveClass(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/del")
    public Result delClass(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/service/open")
    public Result openService(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/follower/list")
    public Result getFollowerList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/serviceTime/modify")
    public Result modifyServiceTime(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
