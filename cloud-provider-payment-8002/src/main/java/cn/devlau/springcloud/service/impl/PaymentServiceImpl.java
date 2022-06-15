package cn.devlau.springcloud.service.impl;

import cn.devlau.springcloud.dao.PaymentDao;
import cn.devlau.springcloud.entity.Payment;
import cn.devlau.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lau
 * @Date 2022/6/14
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
