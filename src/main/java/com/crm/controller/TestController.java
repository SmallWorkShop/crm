package com.crm.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
public class TestController {
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello(String name) {
        return "Hello World! I am " + name;
    }
}
