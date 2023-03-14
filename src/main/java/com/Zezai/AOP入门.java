package com.Zezai;

import com.Zezai.config.SpringConfig;
import com.Zezai.dao.Dao;
import com.Zezai.dao.impl.bookDaoImpl;
import com.Zezai.service.impl.bookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOP入门 {
    //要求:在接口执行前输出当前系统时间
    //思路:1.导入坐标
    //    2.制作连接点
    //    3.制作通知与通知类
    //    4.定义切入点
    //    5.定义切面
    public static void main(String[] args) {
        ApplicationContext atx=new AnnotationConfigApplicationContext(SpringConfig.class);
        Dao dao=(Dao)atx.getBean(Dao.class);
        dao.daoAction3();
    }
}
