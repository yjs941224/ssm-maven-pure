package com.java.service.imp;

import com.github.pagehelper.PageHelper;
import com.java.mapper.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ComServiceImpl implements com.java.service.ComService {
    @Autowired
    private ComputerMapper computerMapper;

    @Override
    public List<Map<String,Object>> findCom(Integer pageNum, Integer pageSize){
        //分页
        PageHelper.startPage(pageNum, pageSize);
        return computerMapper.selectCom();
    }
}
