package com.rocky.mall.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.*;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.*;

import javax.sql.DataSource;
import java.sql.SQLException;


/**
 * @author Rocky
 * @Configuration -> make sure all methods annotated by @Bean singleton
 * @EnableAspectJAutoProxy -> enable aop
 * @MapperScan -> mybatis -- scan mapper
 */
@Configuration
@ComponentScan(value = "com.rocky.mall",excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {EnableWebMvc.class,Controller.class,RestController.class})})
@MapperScan("com.rocky.mall.mapper")
public class AppConfig  {


    /**
     * session工厂
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        PathMatchingResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        return factoryBean.getObject();
    }

    /**
     * 数据源
     */
    @Bean
    public DataSource dataSource() throws SQLException {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/db_spring?characterEncoding=UTF-8");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("Rocky@nb");
        //return new PooledDataSource("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/test", "root", "root");
        return driverManagerDataSource;
    }

    /**
     * 事务管理
     */
    @Bean
    public DataSourceTransactionManager transactionManager() throws SQLException {
        return new DataSourceTransactionManager(dataSource());
    }





}
