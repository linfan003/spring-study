package com.lf.demotest.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author linfan
 * @Date 2020/12/9 11:36
 * @Version 1.0
 */
@Mapper
public interface LogMapper {
    /**
     * 获取所有的日志列表
     * @return
     */
    List<Map> getLogs();
    List<Map> getLogs1();
    List<Map> getLogs2();
}
