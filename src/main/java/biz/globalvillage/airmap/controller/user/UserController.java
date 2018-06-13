package biz.globalvillage.airmap.controller.user;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/airmap/user")
public class UserController {


    @PostMapping("/getTokenByAppletOpenId")
    public Result getTokenByAppletOpenId(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


    @PostMapping("/bindAppletOpenId")
    public Result bindAppletOpenId(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

}
