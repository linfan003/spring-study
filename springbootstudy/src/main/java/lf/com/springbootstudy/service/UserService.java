package lf.com.springbootstudy.service;

import lf.com.springbootstudy.domain.User;

import java.util.List;

/**
 * @Author linfan
 * @Date 2020/12/3 16:04
 * @Version 1.0
 */
public interface UserService {
    /**
     * 获取所有的用户列表
     * @return
     */
    List<User> getUsers();
}
