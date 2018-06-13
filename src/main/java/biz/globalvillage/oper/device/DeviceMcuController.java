package biz.globalvillage.oper.device;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/device/mcu")
public class DeviceMcuController {

    @PostMapping("/list")
    public Result getMcuList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/save")
    public Result saveMcu(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/del")
    public Result delMcu(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/get")
    public Result getMcu(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/update")
    public Result update(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


}
