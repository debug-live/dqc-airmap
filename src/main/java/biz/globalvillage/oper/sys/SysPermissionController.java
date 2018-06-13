package biz.globalvillage.oper.sys;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/sys/permission")
public class SysPermissionController {

    @PostMapping("/list")
    public Result getPermissionList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
