package biz.globalvillage.oper.sys;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/sys/role")
public class SysRoleController {

    @PostMapping("/list")
    public Result listRole(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result getRoleDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


    @PostMapping("/del")
    public Result delRole(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/save")
    public Result saveRole(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/group/list")
    public Result getRoleGroupList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
