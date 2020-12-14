package com.lf.springclould.service;

import com.lf.common.domain.Payment;

/**
 * @Author linfan
 * @Date 2020/12/13 20:12
 * @Version 1.0
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
