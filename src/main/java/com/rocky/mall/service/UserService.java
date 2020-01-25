package com.rocky.mall.service;

import com.rocky.mall.bean.User;

import java.util.List;

public interface UserService {


    List<User> selectUserByLoginName(String uname);
}
