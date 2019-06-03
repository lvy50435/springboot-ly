package com.miaosha.controller;

import com.miaosha.dao.UsertMapper;
import com.miaosha.data.Usert;
import com.miaosha.service.impl.testServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String getAlla (@RequestParam(name="id") String id) {
        System.out.print("sssdiyi----" + id);
        Usert ssa =testserviceImpl.getAll(id);
        System.out.print("ssseee22222"+id);
        if (ssa == null){
            return "lllalalal!   ---"+ssa;
        }else{

            return ssa.getAccount()+ssa.getId()+ssa.getPwd();
        }
    }
}
