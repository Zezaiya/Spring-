package com.Zezai.service.impl;

import com.Zezai.dao.Dao;
import com.Zezai.dao.impl.bookDaoImpl;
import com.Zezai.domain.brand;
import com.Zezai.service.Service;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@org.springframework.stereotype.Service("bookServiceImpl")//设置这个类为bean类，取名为bookServiceImpl
@ComponentScan("com.Zezai")//光设置类不行，必须让容器能找到该bean，所以要添加扫描仪
@Scope("prototype")
public class bookServiceImpl implements Service {
    @Autowired
    private Dao dao; //通过new的方式耦合度仍然很高,所以我们需要通过方法来创建对象
    @Value("${number}")
    public int number;
    @Value("${name}")
    public String name;
    public void serviceAction() {
          dao.daoAction();
    }


    //提供对应的set方法,IoC会通过我们写的配置文件<property name="Dao" ref="DaoImpl"></property>,自动将对应的实现类对象daoImpl传入dao内
    //注意:set方法其实在创建容器时就会被调用,所以我们从容器中取出来的service对象其实里面就已经帮我们自动获取了daoImpl这个对象
    /*public void setDao(Dao dao) {
        this.dao = dao;
    }*/

    public List<brand> selectAll(){
        List<brand> brandInfo=dao.selectAll();
        return brandInfo;
    }
    /*@PostConstruct
    public void afterPropertiesSet() {
        System.out.println("init.....");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("destroy.....");
    }*/



}
