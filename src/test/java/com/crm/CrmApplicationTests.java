package com.crm;

import com.crm.controller.UserController;
import com.crm.service.UserService;
import com.crm.service.impl.UserServiceImpl;
import com.crm.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrmApplicationTests {


    @Test
    public void contextLoads() {
        User user = new User();
        user.setUpassword("123");
        user.setUsername("wpx");
        user.setUseraccont("wpx");
//		UserController userController = new UserController();
        UserService us = new UserServiceImpl();
        us.addUser(user);
    }

}
