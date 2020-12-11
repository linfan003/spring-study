package lf.com.springbootstudy.contorller;


import lf.com.springbootstudy.domain.User;
import lf.com.springbootstudy.service.UserService;
import lf.com.springbootstudy.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author linfan
 * @Date 2020/12/10 15:39
 * @Version 1.0
 */
@RestController
public class RedisController {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private UserService userService;
    /**
     * 测试获取string类型
     * @return
     */
    @RequestMapping("/redis")
    public String redis() {
        String myKey = redisTemplate.opsForValue().get("myKey");
        return myKey;
    }

    /**
     * 保存用户到redis--对象--转成string
     * @param user
     */
    @RequestMapping("/redisSave")
    public void redisSave(@RequestBody User user) {
        redisTemplate.opsForValue().set("user1", user.toString());
    }

    /**
     * 保存用户到redis--对象--格式化
     * @param user
     */
    @RequestMapping("/redisSave1")
    public void redisSave1(@RequestBody User user) {
        boolean redisSave1 = redisUtil.set("redisSave1", user);
        System.out.println(redisSave1);

    }
    /**
     *从redis查询对象--对象--格式化
     *
     */
    @RequestMapping("/getRedisSave1")
    public Object getRedisSave1() {
        Object redisSave1 = redisUtil.get("redisSave1");
        return redisSave1;
    }

    /**
     * 保存id列表--list
     * @param ids
     */
    @RequestMapping("/saveRedisList/{ids}")
    public void saveRedisList(@PathVariable List ids) {
        redisTemplate.opsForList().rightPushAll("ids1",ids);
    }

    /**
     * 查询指定List的指定位置的数据
     * @param ids
     * @param id
     * @return
     */
    @RequestMapping("/getRedisList")
    public String getRedisList(@RequestParam(value = "ids", required = true)  String ids,
                             @RequestParam(value = "id", required = true)  int id) {
        String index = redisTemplate.boundListOps(ids).index(id);
        return index;
    }
    /**
     * 获取所有的用户数据，如果redis存在从redis获取，如果不存在从数据库获取，并保存到redis中
     * @return
     */
    @RequestMapping("/getRedisUsers")
    public Object getUsers() {
        Object users = redisUtil.get("users");
        if (users == null) {
            List<User> listUser = userService.getUsers();
            redisUtil.set("users", listUser);
            users = listUser;
        }
        return users;
    }
    /**
     * 获取指定的用户数据，如果redis存在从redis获取，如果不存在从数据库获取，并保存到redis中
     * @param ids
     * @return
     */
    @RequestMapping("/getRedisUsers/{ids}")
    public Object getRedisUsers(@PathVariable List ids) {
        Object users = redisUtil.get("usersIds");
        if (users == null) {
            List<User> listUser = userService.getUserByIds(ids);
            redisUtil.set("usersIds", listUser);
            users = listUser;
        }
        return users;
    }
}
