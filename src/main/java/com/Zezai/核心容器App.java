package com.Zezai;

import com.Zezai.service.Service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class 核心容器App {
    public static void main(String[] args) {
        //获取容器
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //Dao dao=(Dao)ctx.getBean("DaoImpl");
        //获取Bean
       //Service service=(Service) ctx.getBean("ServiceImpl");
       //DataSource dataSource=(DataSource)ctx.getBean("dataSource");
        //System.out.println(service);
       // service.serviceAction();
        //ctx.close();暴力的方式
        ctx.registerShutdownHook();
     /* Service service=new ServiceImpl();
      service.serviceAction();*/
    }
}
