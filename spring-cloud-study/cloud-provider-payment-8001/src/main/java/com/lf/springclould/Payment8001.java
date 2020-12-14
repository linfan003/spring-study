package com.lf.springclould;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author linfan
 * @Date 2020/12/13 13:30
 * @Version 1.0
 */
@SpringBootApplication
@RestController
public class Payment8001 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8001.class, args);
    }
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello world";
    }
}
