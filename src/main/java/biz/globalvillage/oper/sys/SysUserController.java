package biz.globalvillage.oper.sys;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/sys/user")
public class SysUserController {

    @PostMapping("/save")
    public Result saveUser(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list")
    public Result listUser(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/del")
    public Result delUser(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/lock")
    public Result lockUser(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/password/change")
    public Result changePwd(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/password/reset")
    public Result resetPwd(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/current")
    public Result getCurrentUser(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 并不是直接调用接口的，而是使用shiro框架来完成
     * @return
     */
    @PostMapping("/login")
    public Result login(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 并不是直接调用接口的，而是使用shiro框架来完成
     * @return
     */
    @PostMapping("/logout")
    public Result logout(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

}
