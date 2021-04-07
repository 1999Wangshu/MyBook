package com.trkj.fanpu.controller.money;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.fanpu.entity.CwPayment;
import com.trkj.fanpu.service.money.PaymentService;
import com.trkj.fanpu.utils.Response;
import com.trkj.fanpu.vo.PaymentInVo;
import com.trkj.fanpu.vo.PaymentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pay")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("findPayment")
    public Response findPaymentByPaymentVo(PaymentVo vo){

        System.out.println(">>>"+ vo);
        if (vo.getPageIndex() <=0 || vo.getPageIndex()==null || vo.getPageSize() <=0){
            vo.setPageIndex(1);
            vo.setPageSize(5);
        }
        PageHelper.startPage(vo.getPageIndex(),vo.getPageSize());
        List<CwPayment> payments = paymentService.findCwPaymentByPaymentVo(vo);
        PageInfo page = new PageInfo(payments, vo.getPageSize());

        return Response.ok().data("pageInfo",page);
    }

    @PostMapping("addPayment")
    public void addPayment(PaymentInVo paymentInVo){

        paymentService.insertPayment(paymentInVo);

    }

    @PutMapping("modifyPayment")
    public void modifyPayment(PaymentInVo paymentInVo){

        paymentService.updatePayment(paymentInVo);
    }
}
