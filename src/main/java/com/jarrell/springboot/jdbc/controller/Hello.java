package com.jarrell.springboot.jdbc.controller;

import com.jarrell.springboot.jdbc.dao.UserDao;
import com.jarrell.springboot.jdbc.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class Hello {

    @Autowired
    JdbcTemplate jdbc;

    @Autowired
    UserDao userDao;

    @RequestMapping("/hello")
    public Map<String,Object> hello(Integer id){
        List<Map<String, Object>> maps = jdbc.queryForList("select * from user where id = " + id);
        return maps.size()>0 ? maps.get(0) : null;
    }

    @GetMapping("/user/{id}")
    public UserVO getUserById(@PathVariable("id") Integer id){
        return userDao.getUserById(id);
    }

    @GetMapping("/getAllUser")
    public List<UserVO> getAllUser(){
        return userDao.getAllUser();
    }

    @GetMapping("/addUser")
    public UserVO addUser(UserVO vo){
        userDao.insertUser(vo);
        return vo;
    }

    @GetMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        userDao.deleteUser(id);
    }




}
