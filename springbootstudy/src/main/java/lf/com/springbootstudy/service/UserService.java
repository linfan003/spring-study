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
    /**
     * 根据传入的id列表获取指定的用户
     * @param ids
     * @return
     */
    List<User> getUserByIds(List ids);

    /**
     * 根据传入的id获取指定的用户
     * @param id
     * @return
     */
    User getUserById(int id);

    /**
     * 用户新增
     * @param user
     */
    void save(User user);
}
