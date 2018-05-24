package com.alibaba.druid.monitor.service;

import com.alibaba.druid.monitor.dao.AppMapper;
import com.alibaba.druid.monitor.dao.UserMapper;
import com.alibaba.druid.monitor.entity.App;
import com.alibaba.druid.monitor.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wenshao<szujobs@hotmail.com>
 */
@Service("appService")
public class AppService {

    @Autowired
    private AppMapper appMapper;

    public boolean existsUser(String name) {
        throw new UnsupportedOperationException();
    }

    public App createApp(String name) {
        App app = new App();
        app.setName(name);
        appMapper.addApp(app);

        return app;
    }

    public void addApp(App app){
        appMapper.addApp(app);
    }

    public App queryByID(Integer id){
        return appMapper.queryByID(id);
    }

    public List<App> getAll(){
        return appMapper.getAll();
    }

    public String passwordDigest(String password) {
        throw new UnsupportedOperationException();
    }
}
