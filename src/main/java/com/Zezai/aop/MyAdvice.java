package com.Zezai.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect//告诉Spring这是切面
public class MyAdvice  {
    @Pointcut("execution(int com.Zezai.dao.impl.bookDaoImpl.daoAction3())")  //定义切入点,指定在哪个方法那执行
    private void pt(){}

    @Around("pt()")   //表示在切入点方法执行前执行
    public Object around(ProceedingJoinPoint pjp)throws Throwable{
        System.out.println("before......");    //将想要赋予的方法单独做成一个通知
             Object a=pjp.proceed();                   //表示在此处执行原方法
        System.out.println(a);
        System.out.println("after.......");
        return a;
    }
}
