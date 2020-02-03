package com.rocky.mall.controller;

import com.alibaba.fastjson.JSONObject;
import com.rocky.mall.bean.User;
import com.rocky.mall.bean.UserInfo;
import com.rocky.mall.mapper.UserMapper;
import com.rocky.mall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Rocky
 * 注册页与验证
 *
 * 测试例子
 */
@Controller
@RequestMapping(value = "/reg")
public class ExpController  {

    private UserService userService;
    private UserMapper userMapper;

    public ExpController(UserService userService,UserMapper userMapper){
        this.userService = userService;
        this.userMapper  =userMapper ;
    }

    @RequestMapping(value = "/index.do")
    public String loginPage(){
        System.out.println();
        return "index";
    }


   @RequestMapping(value = "/data.do")
   @ResponseBody
   public String existLoginName(@RequestParam("uname") String uname){
       System.out.println("传入参数"+uname);
       List<User> userList = userService.selectUserByLoginName(uname);
       //查询到的对象
       System.out.println(userList.toString());
       JSONObject jo = new JSONObject();
       if(!userList.isEmpty()){
           jo.put("userExist",true);
       }else{
           jo.put("userExist", false);
       }
       //返回json数据内容
       System.out.println(jo.toString());
       return jo.toString();
   }

    @RequestMapping(value = "/index")
    @ResponseBody
    public String index(){
        Map<Integer, UserInfo> map  = new HashMap<>();
        map = userMapper.getUser(1);
        System.out.println(map.get(1));
        return "查看sql信息";
    }



}
