package lf.com.springbootstudy.service;

import lf.com.springbootstudy.domain.User;

import java.util.List;
import java.util.Map;

/**
 * @Author linfan
 * @Date 2020/12/9 11:35
 * @Version 1.0
 */
public interface LogService {
    /**
     * 获取所有的日志列表
     * @return
     */
    List<Map> getLogs();
    List<Map> getLogs1();
    List<Map> getLogs2();
}
