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

    public void daoAction() {
        System.out.println("dao action");
    }
}
