package com.alibaba.druid.monitor.controller;

import com.alibaba.druid.monitor.dao.UserMapper;
import com.alibaba.druid.monitor.entity.User;
import com.alibaba.druid.monitor.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by SYSTEM on 2018/5/24.
 */
@Controller
@RequestMapping("/user")
public class IndexController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/id",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public String getById(Integer id){
        return JSON.toJSONString(userService.queryByID(id));
    }


    @ResponseBody
    @RequestMapping(value = "/all",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public String getAll(){
        return JSON.toJSONString(userService.getAll());
    }

    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public String addUser(User user){
        userService.addUser(user);
        return "{\"status\":\"0\",\"message\":\"添加成功\"}";
    }

}
