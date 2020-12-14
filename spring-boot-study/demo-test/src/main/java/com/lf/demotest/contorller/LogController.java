package com.lf.demotest.contorller;

import com.lf.demotest.domain.User;
import com.lf.demotest.service.LogService;
import com.lf.demotest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author linfan
 * @Date 2020/12/3 15:59
 * @Version 1.0
 */
@RestController
public class LogController {
    @Autowired
    private UserService userService;
    @Autowired
    private LogService logService;
    @RequestMapping("/getLogs")
    public List<Map> getLogs() {
        List<Map> users = logService.getLogs();
        return users;
    }
    @RequestMapping("/getLogs1")
    public List<Map> getLogs1() {
        List<Map> users = logService.getLogs1();
        return users;
    }
    @RequestMapping("/getLogs2")
    public List<Map> getLogs2() {
        List<Map> users = logService.getLogs2();
        return users;
    }
}
