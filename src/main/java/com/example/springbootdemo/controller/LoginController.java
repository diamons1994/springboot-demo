package com.example.springbootdemo.controller;

import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/loginUser")
    public String login(){

        return "login";
    }


    @RequestMapping("getUser/{id}")
    public String getUser(@PathVariable int id){
        return userService.selectById(id).toString();
    }


}
