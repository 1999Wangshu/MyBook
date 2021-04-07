package com.trkj.fanpu.service.money;

import com.trkj.fanpu.entity.CwOPayment;
import com.trkj.fanpu.vo.OPaymentInVo;
import com.trkj.fanpu.vo.PaymentVo;

import java.util.List;

public interface OPaymentService {



    List<CwOPayment> findCwOPaymentByPaymentVo(PaymentVo paymentVo);

    void insertOPayment(OPaymentInVo oPaymentInVo);

    void updateOPayment(OPaymentInVo oPaymentInVo);
}
