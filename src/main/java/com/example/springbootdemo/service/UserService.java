package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User selectById(int id){
        return userMapper.selectById(id);
    }
}
