package com.Zezai;

import com.Zezai.config.SpringConfig;
import com.Zezai.service.Service;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

public class Mybatis整合App {
    public static void main(String[] args) {
        ApplicationContext atx=new AnnotationConfigApplicationContext(SpringConfig.class);
        Service service=(Service) atx.getBean("bookServiceImpl");
        service.serviceAction();
    }
}
