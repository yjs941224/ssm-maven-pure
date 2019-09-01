package com.java.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


public interface BookMapper {
    /**
     * 查询所有book
     * @return
     */
    @Select("SELECT * from books")
    List<Map<String,Object>> selectBooks();
}
