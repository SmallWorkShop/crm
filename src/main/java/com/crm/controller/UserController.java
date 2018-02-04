package com.crm.controller;

import com.alibaba.fastjson.JSON;
import com.crm.common.JsonResult;
import com.crm.service.UserService;
import com.crm.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public String addUser(User user) {
        int i = userService.addUser(user);
        if (i > 0) {
            return new JsonResult<User>(true, "新增用户成功", i, null).toString();
        } else {
            return new JsonResult<User>(false, "新增用户失败", 0, null).toString();
        }
    }

    @ResponseBody
    @RequestMapping(value = "/serch", produces = {"application/json;charset=UTF-8"})
    public String fiddAllUsers(User user) {
        List<User> userList;

        if(user != null) {
            userList = userService.findAllUsersByParam(user.getUsername(),user.getUseraccont());
        } else {
            userList = userService.findAllUsersByParam(null,null);
        }

        if(userList != null) {
            return new JsonResult<User>(true, "查询用户成功", userList.size(), userList).toString();
        } else {
            return new JsonResult<User>(true, "没有用户信息", 0, null).toString();
        }

    }

}
