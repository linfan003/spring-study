package com.lf.springclould.service.impl;

import com.lf.springclould.domain.Payment;
import com.lf.springclould.mapper.PaymentMapper;
import com.lf.springclould.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author linfan
 * @Date 2020/12/13 20:12
 * @Version 1.0
 */
@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;
    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }
    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
