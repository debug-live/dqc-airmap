package biz.globalvillage.airmap.controller.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.dto.device.AuthedUserListDTO;
import biz.globalvillage.airmap.dto.device.UserDeviceListDTO;
import biz.globalvillage.airmap.param.device.*;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/airmap/user/device")
public class UserDeviceController {


    @PostMapping("/list")
    public Result<List<UserDeviceListDTO>> getUserDeviceList(UserDeviceListParam param){
        //TODO
        List<UserDeviceListDTO> dtos = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(dtos);
    }

    @PostMapping("/remove")
    public Result removeUserDevice(UserDeviceRemoveParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/rename")
    public Result renameNickName(UserDeviceRenameParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/authUser/list")
    public Result<AuthedUserListDTO> getAuthUserList(AuthedUserListParam param){

        AuthedUserListDTO dto = new AuthedUserListDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    @PostMapping("/authToUser")
    public Result authToUser(AuthToUserParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/authUser/del")
    public Result delAuthUser(AuthedUserDelParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/changeStrainer")
    public Result changeStrainer(StrainerChangeParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/refreshLocation")
    public Result refreshDeviceLocation(DeviceLocRefreshParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/manualFillLoction")
    public Result manualFillLocation(DeviceLocManualFillParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/mappingOnScreen")
    public Result mappingOnScreen(MapOnScreenParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     * 架构变化，该接口废弃
     */
    @Deprecated
    @PostMapping("/getPm25ExcepState")
    public Result getPm25ExcepState(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    /**
     *
     * 目前空气地图小程序，没有设备详情
     */
    @Deprecated
    @PostMapping("/detail")
    public Result getUserDeviceDetail(){
        //TODO
        return ResponseUtil.setDefaultSuccessResponse();
    }


}
