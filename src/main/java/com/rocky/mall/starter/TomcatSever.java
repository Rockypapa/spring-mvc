package com.rocky.mall.starter;

import com.rocky.mall.config.MvcConfig;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.startup.Tomcat;

public class TomcatSever {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8888);
        System.out.println("-----tomcat----------init----------");
        //核心内容 -- tomcat 资源路径--配错无法访问页面
        tomcat.addWebapp("/","D:\\JAVA\\IDEAworkspace\\spring-mvc\\src\\main\\resources\\");
        try{
            tomcat.start();
            tomcat.getServer().await();
        }catch (LifecycleException e){
            e.printStackTrace();
        }
    }
}
