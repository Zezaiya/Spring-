package com.Zezai;

import com.Zezai.dao.Dao;
import com.Zezai.dao.impl.DaoImpl;
import com.Zezai.service.Service;
import com.Zezai.service.impl.ServiceImpl;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        //获取容器
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取Bean
        //Service service=(Service) ctx.getBean("ServiceImpl");
        DataSource dataSource=(DataSource)ctx.getBean("dataSource");
        System.out.println(dataSource);
       // service.serviceAction();
        //ctx.close();暴力的方式
        ctx.registerShutdownHook();
     /* Service service=new ServiceImpl();
      service.serviceAction();*/
    }
}