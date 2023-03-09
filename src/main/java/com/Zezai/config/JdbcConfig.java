package com.Zezai.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {
    //1.定义一个方法获得要管理的对象
    //2.添加@Bean标签,表示当前方法返回的是Bean类型
    @Bean
    public DataSource dataSource(){
        DruidDataSource ds=new DruidDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring_db");
        ds.setUsername("root");
        ds.setPassword("123456");
        return ds;
    }
}
