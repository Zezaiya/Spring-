package com.Zezai.dao.impl;

import com.Zezai.dao.Dao;
import org.springframework.stereotype.Repository;

@Repository("bookDaoImpl")
public class bookDaoImpl implements Dao {
    public void daoAction() {
        System.out.println("dao action");
    }
}
