package com.rocky.mall.starter;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class TomcatSever {
    public static void main(String[] args) {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8888);
        tomcat.addWebapp("/","D:\\JAVA\\IDEAworkspace\\spring-mvc\\src\\main\\resources\\");
        try{
            tomcat.start();
            tomcat.getServer().await();
        }catch (LifecycleException e){
            e.printStackTrace();
        }
    }
}
