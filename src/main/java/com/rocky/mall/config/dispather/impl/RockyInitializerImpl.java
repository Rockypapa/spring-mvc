package com.rocky.mall.config.dispather.impl;

import com.rocky.mall.config.AppConfig;
import com.rocky.mall.config.MvcConfig;
import com.rocky.mall.config.dispather.RockyInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author Rocky
 */
public class RockyInitializerImpl /* implements RockyInitializer */{
    /*


    @Override
    public void start(ServletContext context)throws ServletException {
        //初始化spring 容器  以注解的方式
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(AppConfig .class, MvcConfig.class);
//        ac.refresh();
        //A就是B的父容器   默认如果你没有自己写逻辑去控制的话 那么通过B容器去找一个对象的时候 他会尝试去A(父)容器里面去找...
        //spring mvc 做了 现在是直接默认不去父容器找 直接去子容器
        DispatcherServlet servlet = new DispatcherServlet(ac);
        ///Spring 和Spring mvc 是2个不同的容器
        ServletRegistration.Dynamic registration = context.addServlet("app", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/*");
    }


     */

}
