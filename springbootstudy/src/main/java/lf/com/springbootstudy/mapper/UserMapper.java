package lf.com.springbootstudy.mapper;

import lf.com.springbootstudy.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author linfan
 * @Date 2020/12/3 16:10
 * @Version 1.0
 */

@Mapper
public interface UserMapper {
    List<User> getUsers();
}
