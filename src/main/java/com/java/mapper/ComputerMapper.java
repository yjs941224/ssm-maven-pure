package com.java.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface ComputerMapper {

    /**
     * 查询所有computer
     * @return
     */
    @Select("SELECT * from computers")
     List<Map<String,Object>> selectCom();

}
