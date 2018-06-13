package biz.globalvillage.oper.common;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/common")
public class CommonController {

    /**
     *
     * 所有的获取mqtt客户端账号的请求，都应该合并，使用这个
     */
    @PostMapping("/getMqttAccount")
    public Result getMqttAccount(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/pic/upload")
    public Result uploadPic(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
