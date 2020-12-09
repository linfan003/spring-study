package lf.com.springbootstudy.service.impl;

import lf.com.springbootstudy.domain.User;
import lf.com.springbootstudy.mapper.UserMapper;
import lf.com.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author linfan
 * @Date 2020/12/3 16:08
 * @Version 1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
    }

    @Override
    public List<User> getUserByIds(List ids) {
        return userMapper.getUserByIds(ids);
    }

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }

}
