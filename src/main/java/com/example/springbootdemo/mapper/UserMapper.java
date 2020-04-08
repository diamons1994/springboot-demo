package com.example.springbootdemo.mapper;


import com.example.springbootdemo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectById(int id);
}
