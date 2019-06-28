package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;



@Service
public class Userservice {
    @Autowired
    private UserMapper userMapper;

    public  List<User> selectUserAndPhone_listById(int id){
        return userMapper.selectUserAndPhone_listById(id);
    }
    public  List<User> selectPhone_listById(int id){
        return userMapper.selectPhone_listById(id);
    }
    public List<User> findByName(String name) {
        return userMapper.findUserByName(name);
    }

    public User insertUser(User user) {
        userMapper.insertUser(user);
        return user;
    }
    public List<User> ListUser(){
        return	userMapper.ListUser();
    }


    public int Update(User user){
        return userMapper.Update(user);
    }

    public int delete(int id){
        return userMapper.delete(id);
    }
}
