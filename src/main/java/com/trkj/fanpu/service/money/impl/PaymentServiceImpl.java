package com.trkj.fanpu.service.money.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.fanpu.dao.money.PaymentMapper;
import com.trkj.fanpu.entity.CwPayment;
import com.trkj.fanpu.service.money.PaymentService;
import com.trkj.fanpu.vo.PaymentInVo;
import com.trkj.fanpu.vo.PaymentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Transactional
    @Override
    public void insertPayment(PaymentInVo paymentInVo) {

        paymentMapper.insertPayment(paymentInVo);
    }

    @Override
    public List<CwPayment> findCwPaymentByPaymentVo(PaymentVo vo) {

        return paymentMapper.selectPaymentAll(vo);
    }

    @Transactional
    @Override
    public void updatePayment(PaymentInVo paymentInVo) {

        paymentMapper.updatePayment(paymentInVo);
    }
}
