package com.crm.controller;

import com.alibaba.fastjson.JSON;
import com.crm.common.JsonResult;
import com.crm.service.UserService;
import com.crm.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "user")
public class UserController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    /***
     * 注册新用户
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public String addUser(User user) {
//        JsonResult<User> addUserJson = new JsonResult<User>();
        Boolean status=false;
        String msg="新增用户失败";
        Integer count=0;
        if ("".equals(user.getUsername())) {
            logger.error("用户信息字段为空，无法新建用户：{}" + user.toString());

        } else if("".equals(user.getUseraccont())) {
            logger.error("账号信息字段为空，无法新建用户：{}" + user.toString());

        } else {
            int i = userService.addUser(user);
            if (i > 0) {
                status=true;
                msg="新增用户成功";
                count=i;
            }
        }

        return new JsonResult<User>(status, msg, count, null).toString();
    }

    /**
     * 校验用户名是否已使用
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/checkAccountUsed", produces = {"application/json;charset=UTF-8"})
    public String checkAccountUsed(User user) {
        if(user != null) {
            List<User> userList= userService.findAllUsersByCondition(user);
            if (userList.size()>0) {
                return new JsonResult<User>(false, "该账号已被使用", userList.size(), userList).toString();
            } else {
                return new JsonResult<User>(true, "可以注册此账号", userList.size(), userList).toString();
            }
        } else  return new JsonResult<User>(false, "接口请求失败", 0, null).toString();
    }

    @ResponseBody
    @RequestMapping(value = "/serch", produces = {"application/json;charset=UTF-8"})
    public String fiddAllUsers(User user) {
        List<User> userList;

        if (user != null) {
            userList = userService.findAllUsersByParam(user.getUsername(), user.getUseraccont());
        } else {
            userList = userService.findAllUsersByParam(null, null);
        }

        if (userList != null) {
            return new JsonResult<User>(true, "查询用户成功", userList.size(), userList).toString();
        } else {
            return new JsonResult<User>(true, "没有用户信息", 0, null).toString();
        }

    }

}
