package com.rocky.mall.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author Rocky
 */
public class MyWebAplication implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext context) throws ServletException {
        System.out.println("------tomcat init---------");
        AnnotationConfigWebApplicationContext  acWeb = new AnnotationConfigWebApplicationContext();
        acWeb.register(MvcConfig.class,AppConfig.class);
        //暂时不需要--偶尔会报错--理解会补充
        // acWeb.refresh();
        DispatcherServlet servlet = new DispatcherServlet(acWeb);
        ServletRegistration.Dynamic ds = context.addServlet("app",servlet);
        ds.setLoadOnStartup(1);
        //将所有 .do 加入 DispatcherServlet 老师说如果用/*会出错，实际没有
        ds.addMapping("/*");



    }
}
