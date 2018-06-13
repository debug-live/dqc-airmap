package biz.globalvillage.airmap.controller.sms;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/airmap/sms")
public class SmsController {

    @PostMapping("/getVerifyCode")
    public Result getVerifyCode(){
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
