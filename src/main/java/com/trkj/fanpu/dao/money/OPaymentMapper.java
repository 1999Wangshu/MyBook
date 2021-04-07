package com.trkj.fanpu.dao.money;

import com.trkj.fanpu.entity.CwOPayment;
import com.trkj.fanpu.vo.OPaymentInVo;
import com.trkj.fanpu.vo.PaymentVo;

import java.util.List;

public interface OPaymentMapper {


    List<CwOPayment> selectCwOPaymentByPaymentVo(PaymentVo paymentVo);

    void insertOPayment(OPaymentInVo oPaymentInVo);

    void updateOPayment(OPaymentInVo oPaymentInVo);
}
