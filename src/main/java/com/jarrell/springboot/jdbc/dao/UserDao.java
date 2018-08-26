package com.jarrell.springboot.jdbc.dao;

import com.jarrell.springboot.jdbc.vo.UserVO;
import java.util.List;

public interface UserDao {

    UserVO getUserById(Integer id);

    int insertUser(UserVO user);

    int deleteUser(Integer id);

    List<UserVO> getAllUser();



}
