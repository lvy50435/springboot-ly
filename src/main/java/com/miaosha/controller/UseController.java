package com.miaosha.controller;

import com.miaosha.dao.UsertMapper;
import com.miaosha.data.Usert;
import com.miaosha.errorCode.BussException;
import com.miaosha.errorCode.EmBusinessError;
import com.miaosha.response.CommonReturnType;
import com.miaosha.service.impl.testServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2019/6/1.
 */
@Controller
@RequestMapping("/getU")
public class UseController {
    @Autowired
    public testServiceImpl testserviceImpl;

    @Autowired
    public UsertMapper UsertMapper;


    @RequestMapping("/getAlla")
    @ResponseBody
    public CommonReturnType getAlla (@RequestParam(name="id") String id) throws BussException {
        Usert ssa =testserviceImpl.getAll(id);

       // CommonReturnType.create(ssa);
        if (ssa == null){
            throw new BussException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
         //   return CommonReturnType.create(ssa);
        }else{

            return null;
        }
    }

    //定义
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object handlerException (HttpServletRequest request,Exception ex){
        BussException bussException =(BussException)  ex;
        CommonReturnType commonReturnType = new CommonReturnType();
        commonReturnType.setData(ex);
        commonReturnType.setStatus("fail");
        Map<String,Object> responseData = new HashMap<String ,Object>();

        responseData.put("errCode",bussException.getErrCode());
        responseData.put("errMsg",bussException.getErrMsg());
        commonReturnType.setData(responseData);
        return commonReturnType;
    }

}
