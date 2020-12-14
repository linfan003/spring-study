package com.lf.springclould.mapper;

import com.lf.springclould.domain.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @Author linfan
 * @Date 2020/12/13 20:15
 * @Version 1.0
 */
@Mapper
public interface PaymentMapper {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
