package com.alibaba.druid.monitor.service;

import java.util.Date;
import java.util.List;

import com.alibaba.druid.monitor.dao.UserMapper;
import com.alibaba.druid.monitor.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wenshao<szujobs@hotmail.com>
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserMapper      userMapper;

    public boolean existsUser(String name) {
        throw new UnsupportedOperationException();
    }

    public User queryByID(Integer id){
        return userMapper.queryByID(id);
    }

    public void addUser(User user){
        userMapper.addUser(user);
    }

    public User createUser(String name, String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setEmail(email);
        user.setPassword(password);
        userMapper.addUser(user);

        return user;
    }

    public List<User> getAll(){
        return userMapper.getAll();
    }

    public String passwordDigest(String password) {
        throw new UnsupportedOperationException();
    }
}
