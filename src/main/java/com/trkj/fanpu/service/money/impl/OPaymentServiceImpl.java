package com.trkj.fanpu.service.money.impl;

import com.trkj.fanpu.dao.money.OPaymentMapper;
import com.trkj.fanpu.entity.CwOPayment;
import com.trkj.fanpu.service.money.OPaymentService;
import com.trkj.fanpu.vo.OPaymentInVo;
import com.trkj.fanpu.vo.PaymentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OPaymentServiceImpl implements OPaymentService {

    @Autowired
    private OPaymentMapper oPaymentMapper;



    @Override
    public List<CwOPayment> findCwOPaymentByPaymentVo(PaymentVo paymentVo) {

        return oPaymentMapper.selectCwOPaymentByPaymentVo(paymentVo);

    }

    @Transactional
    @Override
    public void insertOPayment(OPaymentInVo oPaymentInVo) {

        oPaymentMapper.insertOPayment(oPaymentInVo);
    }

    @Transactional
    @Override
    public void updateOPayment(OPaymentInVo oPaymentInVo) {

        oPaymentMapper.updateOPayment(oPaymentInVo);
    }
}
