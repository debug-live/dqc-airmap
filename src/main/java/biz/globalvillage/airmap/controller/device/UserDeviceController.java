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
        /**
         *
         * 获取设备列表
         *
         * 1. 列表包含个人设备和班级设备，如果是班级设备，只获取优先显示的那一台
         * 2. 每个设备包含的信息除了设备基本的信息以外，还包括室内空气质量、室外空气质量、连接状态、运行状态
         * 3. 显示的顺序上，个人主控设备 > 个人被授权设备 > 班级设备
         *
         */

        List<UserDeviceListDTO> dtos = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(dtos);
    }

    @PostMapping("/remove")
    public Result removeUserDevice(UserDeviceRemoveParam param){
        //TODO
        /**
         * 将设备从设备列表中移除
         *
         * 1. 移除用户和设备的绑定关系
         * 2. 移除用户和设备关于mqtt报文的订阅关系
         * 3. 如果是班级设备，需要删除用户和班级的关联关系
         */

        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/rename")
    public Result renameNickName(UserDeviceRenameParam param){
        //TODO
        /**
         *  重命名设备
         */
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/authUser/list")
    public Result<AuthedUserListDTO> getAuthUserList(AuthedUserListParam param){
        //TODO
        /**
         *  获取授权用户的列表
         */
        AuthedUserListDTO dto = new AuthedUserListDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    @PostMapping("/authToUser")
    public Result authToUser(AuthToUserParam param){
        //TODO
        /**
         *  主控用户授权设备给其它用户
         *  1.只要输入被授权用户的电话号码即可，无需验证
         */

        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/authUser/del")
    public Result delAuthUser(AuthedUserDelParam param){
        //TODO
        /**
         *  删除被授权用户
         *  1.从授权列表里，找到并删除即可
         *
         */
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/changeStrainer")
    public Result changeStrainer(StrainerChangeParam param){
        //TODO
        /**
         *  更换滤网
         *  1.检查要更换的滤网类型是否正确
         *  2.检查设备是否在线，不在线则不能更换滤网，在线才可以更换，因为需要发送MQTT报文重置设备滤网计时
         *  3.处理设备要更换的旧滤网，要知道旧滤网之前是哪个设备的
         *  4.设备换网的次数要记录
         *
         *  注：不管是主控用户，还是授权用户，都可以更换滤网
         *
         */
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/refreshLocation")
    public Result refreshDeviceLocation(DeviceLocRefreshParam param){
        //TODO
        /**
         *  获取地理位置信息
         *  1.向设备发送获取地理位置信息的报文
         */

        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/manualFillLoction")
    public Result manualFillLocation(DeviceLocManualFillParam param){
        /**
         *  手工填充设备地理位置信息
         *  1.选择省市区填入
         */

        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/mappingOnScreen")
    public Result mappingOnScreen(MapOnScreenParam param){
        /**
         *  设备投屏
         *  1.绑定设备、用户和页面二维码三者之间的关系
         *  2.需要创建一个mqtt的客户端账号，并且订阅投屏设备的报文，以便接收设备上报的报文
         *
         */
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
