package biz.globalvillage.oper.net;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/net")
public class NetController {

    @PostMapping("/save")
    public Result saveNet(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list")
    public Result getNetList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result getNetDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/lock")
    public Result lockNet(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/type/list")
    public Result getNetTypeList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
