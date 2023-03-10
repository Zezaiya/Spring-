package com.Zezai;

import com.Zezai.config.SpringConfig;
import com.Zezai.service.Service;
import com.Zezai.service.impl.bookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class 纯注解开发App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource= ctx.getBean(DataSource.class);
        System.out.println(dataSource);

        ctx.close();
    }
}
