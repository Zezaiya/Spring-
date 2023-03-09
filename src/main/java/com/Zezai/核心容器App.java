package com.Zezai;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class 核心容器App {
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
