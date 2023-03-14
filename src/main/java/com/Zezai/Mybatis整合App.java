package com.Zezai;

import com.Zezai.config.SpringConfig;
import com.Zezai.domain.brand;
import com.Zezai.service.Service;
import com.Zezai.service.impl.bookServiceImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;
import java.util.List;

public class Mybatis整合App {
    public static void main(String[] args) {
        ApplicationContext atx=new AnnotationConfigApplicationContext(SpringConfig.class);
        bookServiceImpl service=(bookServiceImpl)atx.getBean("bookServiceImpl");
        service.serviceAction();
        //List<brand>brandInfo=service.selectAll();
        //System.out.println(brandInfo);
    }
}
