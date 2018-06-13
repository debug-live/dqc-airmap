package biz.globalvillage.oper.air;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/report")
public class AirReportController {

    @PostMapping("/classes/indoorAir/count")
    public Result countClassIndoorAir(){
        return ResponseUtil.setDefaultSuccessResponse();
    }


    @PostMapping("/classes/daily/indoorAir")
    public Result getClassDailyIndoorAir(){
        return ResponseUtil.setDefaultSuccessResponse();
    }



    @PostMapping("/school/indoorAir/count")
    public Result countSchoolIndoorAir(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/school/daily/indoorAir")
    public Result getSchoolDailyIndoorAir(){
        return ResponseUtil.setDefaultSuccessResponse();
    }




    @PostMapping("/school/outdoorAir/count")
    public Result countSchoolOutdoorAir(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/school/daily/outdoorAir")
    public Result getSchoolDailyOutdoorAir(){
        return ResponseUtil.setDefaultSuccessResponse();
    }



    @PostMapping("/edu/outdoorAir/count")
    public Result countEduOutdoorAir(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/edu/school/indoorAir/list")
    public Result getEduSchoolIndoorAirList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

}
