package biz.globalvillage.oper.controller.net;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.oper.dto.net.NetDevOnlineDTO;
import biz.globalvillage.oper.dto.net.NetOperGeneralDTO;
import biz.globalvillage.oper.dto.net.NetOperIncrDTO;
import biz.globalvillage.oper.dto.net.NetTotalViewDTO;
import biz.globalvillage.oper.param.net.NetDevOnlineParam;
import biz.globalvillage.oper.param.net.NetOperGeneralParam;
import biz.globalvillage.oper.param.net.NetTotalViewParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/oper/net/oper")
public class NetOperController {

    /**
     * 网点管理->运营概况->网点数量统计（按网点类型）
     *
     */
    @PostMapping("/countByType")
    public Result<Map<Integer, Integer>> countNetByType(){
        HashMap<Integer, Integer> map = new HashMap<>();
        return ResponseUtil.setSuccessDataResponse(map);
    }

    /**
     * 网点管理->运营概况->营销概况统计（按时间选择）
     *
     */
    @PostMapping("/salesGeneralCount")
    public Result<NetOperGeneralDTO> salesGeneralCount(NetOperGeneralParam param){
        NetOperGeneralDTO dto = new NetOperGeneralDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    /**
     * 网点管理->网点列表->设备SN管理->头部的各项统计值（单个网点的设备总数、网点订单数等等，不包含在线、离线设备）
     *
     */
    @PostMapping("/total/view/one")
    public Result<NetTotalViewDTO> OneNetTotalView(NetTotalViewParam param){
        NetTotalViewDTO dto = new NetTotalViewDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    /**
     * 网点管理->网点列表->设备SN管理->头部的各项统计值（单个网点的在线、离线设备统计）
     *
     *
     */
    @PostMapping("/device/onoffline/general/one")
    public Result<NetDevOnlineDTO> getOneNetOnOffLineDeviceGeneral(NetDevOnlineParam param){
        NetDevOnlineDTO dto = new NetDevOnlineDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }



    /**
     * 网点管理->设备列表->头部的各项统计值（经销商旗下全部网点设备总数、网点订单数等等，不包含在线、离线设备）
     *
     * 网点管理->实时运营->头部的五项统计值
     */
    @PostMapping("/total/view/all")
    public Result<NetTotalViewDTO> AllNetTotalView(){
        NetTotalViewDTO dto = new NetTotalViewDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    /**
     * 网点管理->网点列表->设备SN管理->头部的各项统计值（经销商旗下全部网点的在线、离线设备统计）
     *
     *
     */
    @PostMapping("/device/onoffline/general/all")
    public Result<NetDevOnlineDTO> getAllNetOnOffLineDeviceGeneral(){
        NetDevOnlineDTO dto = new NetDevOnlineDTO();
        return ResponseUtil.setSuccessDataResponse(dto);
    }

    /**
     *
     * 网点管理->实时运营->过去30天网点增长曲线
     */
    @PostMapping("/netNum/incr")
    public Result<List<NetOperIncrDTO>> netNumIncr(){
        List<NetOperIncrDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    /**
     *
     * 网点管理->实时运营->过去30天网点设备数增长曲线
     */
    @PostMapping("/deviceNum/incr")
    public Result<List<NetOperIncrDTO>> deviceNumIncr(){
        List<NetOperIncrDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    /**
     *
     * 网点管理->实时运营->过去30天设备绑定数增长曲线
     */
    @PostMapping("/bindCount/incr")
    public Result<List<NetOperIncrDTO>> bindCountIncr(){
        List<NetOperIncrDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    /**
     *
     * 网点管理->实时运营->过去30天订单数量增长曲线
     */
    @PostMapping("/orderNum/incr")
    public Result<List<NetOperIncrDTO>> orderNumIncr(){
        List<NetOperIncrDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }

    /**
     *
     * 网点管理->实时运营->过去30天网点订单总金额增长曲线
     */
    @PostMapping("/orderAmount/incr")
    public Result<List<NetOperIncrDTO>> orderAmountIncr(){
        List<NetOperIncrDTO> list = new ArrayList<>();
        return ResponseUtil.setSuccessDataResponse(list);
    }



}
