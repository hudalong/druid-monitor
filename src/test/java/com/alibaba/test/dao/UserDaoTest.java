package com.alibaba.test.dao;

import com.alibaba.druid.monitor.dao.UserMapper;
import com.alibaba.druid.monitor.entity.User;
import com.alibaba.fastjson.JSON;
import com.alibaba.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by SYSTEM on 2018/5/24.
 */
public class UserDaoTest extends BaseTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void addUser(){
        User user = new User();
        user.setEmail("huyucheng@youxin.com");
        user.setPassword("111111");
        userMapper.addUser(user);
    }

    @Test
    public void getQuery(){
        System.out.println(JSON.toJSONString(userMapper.queryByID(1)));
    }

    @Test
    public void testGetAll(){
        System.out.println(JSON.toJSONString(userMapper.getAll()));
    }
}
