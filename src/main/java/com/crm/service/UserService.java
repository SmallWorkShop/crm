package com.crm.service;

import com.crm.vo.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    List<User> findAllUsersByParam(String userName,String userAccount);
    List<User> findAllUsersByCondition(User user);
}
