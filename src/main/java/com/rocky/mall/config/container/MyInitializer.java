package com.rocky.mall.config.container;

import com.rocky.mall.config.dispather.RockyInitializer;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Rocky
 * 作用           ---容器启动的另一种方式
 * 需要对应META-INF的文件
 * 第二种启动方式 -- need  @HandlesTypes(RockyInitializer.class)    com.rocky.mall.config.dispather.impl.import com.rocky.mall.config.dispather.RockyInitializerImpl;
 */

public class MyInitializer   implements  ServletContainerInitializer {



    @Override
    public void onStartup(Set<Class<?>> set, ServletContext ctx) throws ServletException {
        System.out.println("---container-------init2-----");
    }
        /*
        List<RockyInitializer> list = new ArrayList<>();
        for(Class<?> clazz : set){
            try {
                list.add((RockyInitializer) clazz.newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        //放入属性--启动容器--该类需要META-INF文件
        for(RockyInitializer r:list){
            r.start(ctx);
        }
    }


     */
}
