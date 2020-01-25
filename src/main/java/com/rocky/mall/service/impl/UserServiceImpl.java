package com.rocky.mall.service.impl;

import com.rocky.mall.mapper.UserMapper;
import com.rocky.mall.bean.User;
import com.rocky.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Rocky
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<User> selectUserByLoginName(String uname) {
        return userMapper.getLoginUser(uname);
    }

}
