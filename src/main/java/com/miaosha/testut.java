package com.miaosha;

import com.miaosha.service.impl.testServiceImpl;
import com.miaosha.service.testService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2019/6/1.
 */
@SpringBootApplication(scanBasePackages = {"com.miaosha"})
@RestController
@MapperScan("com.miaosha.dao")
public class testut {



    @RequestMapping
    public void hssa(){
        testService ss = new testServiceImpl();

    }
}
