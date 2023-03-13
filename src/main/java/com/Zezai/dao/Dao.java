package com.Zezai.dao;

import com.Zezai.domain.brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Dao {
    @Select("select * from tb_brand")
    List<brand> selectAll();
    void daoAction();
}
