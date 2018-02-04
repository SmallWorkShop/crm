package com.crm.service.impl;

import com.crm.mapper.UserMapper;
import com.crm.service.UserService;
import com.crm.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public List<User> findAllUsersByParam(String userName, String userAccount) {
        return userMapper.selectAllUsersByParam(userName,userAccount);
    }
}
