package lf.com.springbootstudy.contorller;

import lf.com.springbootstudy.domain.User;
import lf.com.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author linfan
 * @Date 2020/12/3 15:59
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users = userService.getUsers();
        return users;
    }
}
