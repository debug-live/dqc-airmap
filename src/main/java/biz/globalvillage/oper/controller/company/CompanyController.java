package biz.globalvillage.oper.controller.company;

import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.utils.resp.ResponseUtil;
import biz.globalvillage.oper.dto.company.CompanyListDTO;
import biz.globalvillage.oper.param.company.CompanyDetailParam;
import biz.globalvillage.oper.param.company.CompanyListParam;
import biz.globalvillage.oper.param.company.SaveCompanyParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/oper/company")
public class CompanyController {

    @PostMapping("/save")
    public Result<Boolean> saveCompany(SaveCompanyParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/list")
    public Result<List<CompanyListDTO>> getCompanyList(CompanyListParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

    @PostMapping("/detail")
    public Result<CompanyDetailParam> getCompanyDetail(CompanyDetailParam param){
        return ResponseUtil.setDefaultSuccessResponse();
    }

}
