package com.Zezai.service.impl;

import com.Zezai.dao.Dao;
import com.Zezai.dao.impl.DaoImpl;
import com.Zezai.service.Service;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ServiceImpl implements Service, InitializingBean, DisposableBean {
    private Dao dao; //通过new的方式耦合度仍然很高,所以我们需要通过方法来创建对象
    public int number;
    @Override
    public void serviceAction() {
        dao.daoAction();
        }
    //提供对应的set方法,IoC会通过我们写的配置文件<property name="Dao" ref="DaoImpl"></property>,自动将对应的实现类对象daoImpl传入dao内
      //注意:set方法其实在创建容器时就会被调用,所以我们从容器中取出来的service对象其实里面就已经帮我们自动获取了daoImpl这个对象
    public void setDao(Dao dao) {
        this.dao = dao;
    }
    public void setNumber(int number){
        this.number=number;
        System.out.println("number");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy.....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init.....");
    }

}
