package com.java.service.imp;

import com.github.pagehelper.PageHelper;
import com.java.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements com.java.service.BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Map<String,Object>> findBooks(Integer pageNum, Integer pageSize){
        //分页
        PageHelper.startPage(pageNum,pageSize);

        return bookMapper.selectBooks();
    }
}
