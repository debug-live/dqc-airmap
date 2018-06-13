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
        UserDTO dto = new UserDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }


    @PostMapping("/bindAppletOpenId")
    public Result bindAppletOpenId(BindOpenIdParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

}
