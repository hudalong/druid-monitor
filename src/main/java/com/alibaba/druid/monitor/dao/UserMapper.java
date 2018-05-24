package com.alibaba.druid.monitor.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.alibaba.druid.monitor.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    void addUser(@Param("user") User user);

    User queryByID(@Param("id")Integer id);

    List<User> getAll();
}
