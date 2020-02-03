package com.rocky.mall.config.container;


import com.rocky.mall.config.AppConfig;
import com.rocky.mall.config.MvcConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletRegistration;

/**
 * @author Rocky
 * 作用与 MyWebApplication类似
 */
public class MyDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 加载Spring的配置类--applicationContext
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    /**
     * mvc
     * 加载SpringMVC的配置类
     * @return
     */

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{MvcConfig.class};
    }

    /**
     * url-pattren
     * 映射路径
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/*"};
    }



    /**
     * 开启日志
     * @param registration
     */
    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setInitParameter("enableLoggingRequestDetails", "true");
    }

}