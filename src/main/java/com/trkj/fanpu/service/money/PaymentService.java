package com.trkj.fanpu.service.money;


import com.trkj.fanpu.entity.CwPayment;
import com.trkj.fanpu.vo.PaymentInVo;
import com.trkj.fanpu.vo.PaymentVo;

import java.util.List;

public interface PaymentService {

    void insertPayment(PaymentInVo paymentInVo);

    List<CwPayment> findCwPaymentByPaymentVo(PaymentVo paymentVo);

    void updatePayment(PaymentInVo paymentInVo);
}
