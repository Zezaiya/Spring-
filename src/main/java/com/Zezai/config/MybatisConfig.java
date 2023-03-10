package com.Zezai.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {   //这个类就相当于代替了mybatis-config核心配置文件
    @Bean
  public SqlSessionFactoryBean sqlSessionFactory( DataSource dataSource){//SqlSessionFactoryBeans是mybatis为整合Spring提供的一个类，可以快速获取工厂对象
      SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
      sqlSessionFactoryBean.setTypeAliasesPackage("com.Zezai.domain");
      sqlSessionFactoryBean.setDataSource(dataSource);
      return sqlSessionFactoryBean;//这个方法仅能创造工厂，但获取不了mapper对象，所以需要再造一个类
  }

  public MapperScannerConfigurer mapperScannerConfigurer(){
      MapperScannerConfigurer mapperScannerConfigurer=new MapperScannerConfigurer();
      mapperScannerConfigurer.setBasePackage("com.Zezai.dao");
      return mapperScannerConfigurer;
  }
}
