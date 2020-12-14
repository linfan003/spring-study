package com.lf.springcloud.controller;

import com.lf.common.domain.CommonResult;
import com.lf.common.domain.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author linfan
 * @Date 2020/12/14 15:26
 * @Version 1.0
 */
@RestController
public class OrderController {
    private static final String PAYMENT_URL="http://localhost:8001";
    @Resource
    private RestTemplate restTemplate;
    @RequestMapping("/consumer/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment, CommonResult.class);
    }

    @RequestMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}
