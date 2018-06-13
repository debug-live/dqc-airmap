package biz.globalvillage.tools.controller.classes;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tools/class")
public class ClassController {

    @PostMapping("/list")
    public Result getClassList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result getClassDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/add")
    public Result addClass(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/addDevice")
    public Result addClassDevice(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/removeDevice")
    public Result removeClassDevice(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/serviceTime/modify")
    public Result modifyServiceTime(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

}
