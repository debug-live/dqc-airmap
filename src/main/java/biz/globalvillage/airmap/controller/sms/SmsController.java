package biz.globalvillage.airmap.controller.sms;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.param.sms.VerifyCodeSendParam;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/airmap/sms")
public class SmsController {

    @PostMapping("/sendVerifyCode")
    public Result sendVerifyCode(VerifyCodeSendParam param){
        /**
         * 向指定手机号发送验证码
         * 1.发送渠道有两个：创蓝和互忆，目前是创蓝优先，其次互忆
         * 2.不同类型的验证码（比如，注册、重置密码），要分开保存，保存时间为5分钟
         *
         */
        return ResponseUtil.setDefaultSuccessResponse();
    }
}
