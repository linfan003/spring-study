package lf.com.springbootstudy.contorller;

import lf.com.springbootstudy.domain.User;
import lf.com.springbootstudy.service.LogService;
import lf.com.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Author linfan
 * @Date 2020/12/3 15:59
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 获取所有的用户
     * @return
     */
    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users = userService.getUsers();
        return users;
    }

    /**
     * 根据传入的id获取指定的用户
     * @param id
     * @return
     */
    @RequestMapping("/getUserById/{id}")
    public User getUserById(@PathVariable("id") int id) {
        User user = userService.getUserById(id);
        return user;
    }
    /**
     * 根据传入的id获取指定的用户
     * @param id
     * @return
     */
    @RequestMapping("/getUserById2")
    public User getUserById2(@RequestParam(value = "id", required = true)  int id) {
        User user = userService.getUserById(id);
        return user;
    }

    /**
     * 根据传入的id列表获取指定的用户
     * @param ids
     * @return
     */
    @RequestMapping("/getUserByIds/{ids}")
    public  List<User> getUserByIds(@PathVariable List ids) {
        List<User> user = userService.getUserByIds(ids);
        return user;
    }

    /**
     * 用户新增
     * @param user
     */
    @RequestMapping("/save")
    public void save(@RequestBody User user) {
        userService.save(user);
    }

}
