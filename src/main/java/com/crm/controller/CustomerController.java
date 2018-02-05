package com.crm.controller;

import com.crm.common.JsonResult;
import com.crm.service.CustomerService;
import com.crm.vo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/addCus",produces = "application/json;charset=UTF-8")
    public String addCustomer(Customer customer) {
        Integer i = customerService.addCustomer(customer);
        if(i>0) {
            return new JsonResult<Customer>(true,"添加成功",i,null).toString();
        } else return new JsonResult<Customer>(false,"添加失败",0,null).toString();

    }
}
