package com.trkj.fanpu.dao.money;

import com.trkj.fanpu.entity.CwPayment;
import com.trkj.fanpu.vo.PaymentInVo;
import com.trkj.fanpu.vo.PaymentVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface PaymentMapper {


    void insertPayment(PaymentInVo paymentInVo);

    List<CwPayment> selectPaymentAll(PaymentVo paymentVo);

    void updatePayment(PaymentInVo paymentInVo);
}
