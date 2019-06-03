package com.miaosha.service.impl;

import com.miaosha.dao.UsertMapper;
import com.miaosha.data.Usert;
import com.miaosha.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2019/6/1.
 */
@Service
public  class testServiceImpl implements testService {
   @Autowired
    private UsertMapper UserDaoMapper;


    @Override
    public Usert getAll(String id) {
        System.out.print("getAllsss");
        Usert userDao = this.UserDaoMapper.selectByPrimaryKey(id);
        System.out.print("为什么不出");
        return userDao;
    }

    @Override
    public Usert getAll() {
        Usert userDao = this.UserDaoMapper.getAll();
        return userDao;
    }

    @Override
    public String getData() {
        String userDao = this.UserDaoMapper.getData();
        return userDao;
    }
}
