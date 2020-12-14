package com.lf.springclould.controller;

import com.lf.domain.CommonResult;
import com.lf.springclould.domain.Payment;
import com.lf.springclould.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author linfan
 * @Date 2020/12/13 20:04
 * @Version 1.0
 */

@RestController
public class PaymentController {
    private static final Logger logger = LoggerFactory.getLogger(PaymentController.class);
    @Autowired
    private PaymentService paymentService;
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        logger.info("*****插入结果："+result);
        if(result > 0){
            CommonResult result1 = new CommonResult(200, "插入数据成功", result);
            return result1;
        }else{
            return new CommonResult(444,"插入数据失败",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        logger.info("*****插入结果："+payment);
        if(payment != null){
            CommonResult result = new CommonResult(200, "查询成功", payment);
            return result;
        }else{
            return new CommonResult(444,"没有对应记录,查询ID："+id,null);
        }
    }








}
