package com.java.service;

import java.util.List;
import java.util.Map;

public interface ComService {
    List<Map<String,Object>> findCom(Integer pageNum, Integer pageSize);
}
