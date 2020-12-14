package com.lf.demotest.mapper;

import com.lf.demotest.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author linfan
 * @Date 2020/12/3 16:10
 * @Version 1.0
 */

@Mapper
public interface UserMapper {
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
    List<User> getUserByIds(@Param("ids") List ids);

    /**
     * 根据传入的id获取指定的用户
     * @param id
     * @return
     */
    User getUserById(@Param("id")int id);

    /**
     * 用户新增
     * @param user
     */
    void save(User user);
}
