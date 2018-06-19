package biz.globalvillage.airmap.controller.user;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.dto.user.UserDTO;
import biz.globalvillage.airmap.param.user.BindOpenIdParam;
import biz.globalvillage.airmap.param.user.GetByOpenIdParam;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/airmap/user")
public class UserController {


    @PostMapping("/getUserByAppletOpenId")
    public Result<UserDTO> getUserByAppletOpenId(GetByOpenIdParam param){
        //TODO
        /**
         * 根据小程序的openId和unionId获取用户
         * 1.在unionId不为空的情况下，根据unionId来获取用户。
         *   1.1 如果获取到了用户，判断用户有没有openId,
         *     1.1.1 如果用户还没有openId，则要把openId补上
         *   1.2 如果没有获取到用户，则根据openId来获取用户
         *     1.2.1 如果获取到了用户，则把unionId补上
         *     1.2.2 如果没有获取到用户，直接返回还未绑定的结果
         * 2.unionId为空，则根据openId来获取
         *   2.1 如果获取到了用户，将unionId置空
         *   2.2 如果没有获取到用户，直接返回还未绑定的结果
         *
         */

        UserDTO dto = new UserDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }


    @PostMapping("/bindAppletOpenId")
    public Result bindAppletOpenId(BindOpenIdParam param){
        //TODO
        /**
         *  将用户与小程序的openId绑定
         *
         *  1.判断用户是否存在
         *    1.1 存在，则更新用户，将openId与用户绑定
         *    1.2 不存在，开启注册新用户的流程，然后再将openId与用户绑定
         *
         */
        return ResponseUtil.setDefaultSuccessResponse();
    }

}
