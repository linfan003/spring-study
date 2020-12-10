package lf.com.springbootstudy.contorller;


import lf.com.springbootstudy.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
    @RequestMapping("/redis")
    public String redis() {
        String myKey = redisTemplate.opsForValue().get("myKey");
        return myKey;
    }
    @RequestMapping("/redisSave")
    public void redisSave(@RequestBody User user) {
        redisTemplate.opsForValue().set("user1", user.toString());
    }
    @RequestMapping("/redisList/{ids}")
    public void redisList(@PathVariable List ids) {
        redisTemplate.opsForList().rightPushAll("ids1",ids);
    }

    @RequestMapping("/getRedisList")
    public String getRedisList(@RequestParam(value = "ids", required = true)  String ids,
                             @RequestParam(value = "id", required = true)  int id) {
        String index = redisTemplate.boundListOps(ids).index(id);
        return index;
    }
}
