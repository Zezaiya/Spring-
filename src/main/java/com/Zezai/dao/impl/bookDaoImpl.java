package com.Zezai.dao.impl;

import com.Zezai.dao.Dao;
import com.Zezai.domain.brand;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bookDaoImpl")
public class bookDaoImpl implements Dao {
    @Override
    public List<brand> selectAll() {
        return null;
    }
   // @Override
    public void daoAction() {
        System.out.println(System.currentTimeMillis());
        System.out.println("dao Action");
    }

    //@Override
    public void daoAction2() {
        System.out.println("dao Action2");
    }

   // @Override
    public int daoAction3() {
        System.out.println("dao Action3");
        return 666;
    }
}
