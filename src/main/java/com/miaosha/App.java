package com.miaosha;

import com.miaosha.dao.UsertMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"com.miaosha"})
@RestController
@MapperScan({"com.miaosha.dao","com.miaosha.controller","com.miaosha.service"})

public class App
{
    @Autowired
    private UsertMapper UsertMapper;

   /* public String home () {
        testDo ss =testServiceImpl.selectByPrimaryKey("1");
        System.out.print("sss");
        if (ss == null){
            return "lllalalal!";
        }else{
            return ss+"";
        }*/
/*public Usert homa(){

    Usert us = UsertMapper.selectByPrimaryKey("1");

System.out.print(us);
    System.out.print(us+"Aaaaa");
    return us;
}*/


    public static void main( String[] args )
    {
        System.out.println("Hello World!");
        SpringApplication.run(App.class, args);

    }
}

