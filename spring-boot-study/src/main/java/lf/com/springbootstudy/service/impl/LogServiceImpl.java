package lf.com.springbootstudy.service.impl;

import lf.com.springbootstudy.mapper.LogMapper;
import lf.com.springbootstudy.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author linfan
 * @Date 2020/12/9 11:36
 * @Version 1.0
 */
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogMapper logMapper;
    @Override
    public List<Map> getLogs() {
        return logMapper.getLogs();
    }
    @Override
    public List<Map> getLogs1() {
        return logMapper.getLogs1();
    }
    @Override
    public List<Map> getLogs2() {
        return logMapper.getLogs2();
    }
}
