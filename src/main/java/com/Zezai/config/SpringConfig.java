package com.Zezai.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration  //表示这个类就是配置类
@ComponentScan("com.Zezai")   //表示添加了注释扫描器,可以扫描com.Zezai包下的所有注释
@PropertySource("jdbc.properties")//引用了资源包，表示项目里的${}键里的值会从这里查找
@Import({JdbcConfig.class,MybatisConfig.class})  //目的是在不写入SpringConfig类里前提下,实现第三方(druid)bean配置以及获取工厂对象
public class SpringConfig {


}
