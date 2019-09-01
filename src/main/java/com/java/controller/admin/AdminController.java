package com.java.controller.admin;

import com.github.pagehelper.PageInfo;
import com.java.service.BookService;
import com.java.service.ComService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private BookService bookService;
    @Autowired
    private ComService comService;

    @RequestMapping("/test")
    @ResponseBody
    public String test (){
        return "hello,world";
    }

    @RequestMapping("/getBooks")
    @ResponseBody
    public List<Map<String,Object>> getBooks(Integer pageNum, Integer pageSize){
        List<Map<String, Object>> list = bookService.findBooks(pageNum, pageSize);
        PageInfo<Map<String, Object>> mapPageInfo = new PageInfo<>(list);
        return mapPageInfo.getList();
    }

    @RequestMapping("/getCom")
    @ResponseBody
    public List<Map<String,Object>> getCom(Integer pageNum,Integer pageSize){
        List<Map<String, Object>> comlist = comService.findCom(pageNum, pageSize);
        PageInfo<Map<String, Object>> mapPageInfo = new PageInfo<>(comlist);
        return mapPageInfo.getList();
    }


}
