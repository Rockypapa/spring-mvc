package com.rocky.mall.intercepter;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author Rocky
 * 拦截器
 * 需要注解否？  需要测试
 */
public class UserInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object object = request.getSession().getAttribute(""); //get session
        if(object==null){
            //require authorities
            System.out.println("dadad");
            return false;
        }else {
            //let go
            System.out.println();
            return true;
        }

    }
}
