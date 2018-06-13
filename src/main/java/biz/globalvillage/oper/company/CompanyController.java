package biz.globalvillage.oper.company;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oper/company")
public class CompanyController {

    @PostMapping("/save")
    public Result saveCompany(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list")
    public Result getCompanyList(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result getCompanyDetail(){
        return ResponseUtil.setDefaultSuccessResponse();
    }

}
