package com.java.service;

import java.util.List;
import java.util.Map;

public interface BookService {
    List<Map<String,Object>> findBooks(Integer pageNum, Integer pageSize);
}
