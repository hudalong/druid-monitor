package com.alibaba.test.dao;

import com.alibaba.druid.monitor.dao.AppMapper;
import com.alibaba.druid.monitor.entity.App;
import com.alibaba.fastjson.JSON;
import com.alibaba.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by SYSTEM on 2018/5/24.
 */
public class AppDaoTest extends BaseTest {
    @Autowired
    private AppMapper appMapper;

    @Test
    public void testAdd(){
        App app = new App();
        app.setName("今日头条");
        appMapper.addApp(app);
    }

    @Test
    public void testQuery(){
        System.out.println(JSON.toJSONString(appMapper.queryByID(1)));;
    }

    @Test
    public void testGetAll(){
        System.out.println(JSON.toJSONString(appMapper.getAll()));
    }
}
