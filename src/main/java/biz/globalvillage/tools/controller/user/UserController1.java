package biz.globalvillage.tools.controller.user;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.tools.dto.user.UserDTO;
import biz.globalvillage.tools.param.user.BindOpenIdParam;
import biz.globalvillage.tools.param.user.GetByOpenIdParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tools/user")
public class UserController1 {


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
