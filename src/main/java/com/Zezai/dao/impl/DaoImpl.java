package com.Zezai.dao.impl;

import com.Zezai.dao.Dao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("DaoImpl")
public class DaoImpl implements Dao {
    public void daoAction() {
        System.out.println("dao action");
    }
}
