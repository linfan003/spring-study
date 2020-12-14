package com.lf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author linfan
 * @Date 2020/12/14 15:16
 * @Version 1.0
 */
@RestController
@SpringBootApplication
public class Order8002 {
    public static void main(String[] args) {
        SpringApplication.run(Order8002.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
