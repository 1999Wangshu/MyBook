package com.trkj.fanpu.controller.money;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.fanpu.entity.CwOPayment;
import com.trkj.fanpu.service.money.OPaymentService;
import com.trkj.fanpu.utils.Response;
import com.trkj.fanpu.vo.OPaymentInVo;
import com.trkj.fanpu.vo.PaymentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/oPay")
public class OPaymentController {

    @Autowired
    private OPaymentService oPaymentService;

    @GetMapping("findOPayment")
    public Response findPaymentByPaymentVo(PaymentVo vo){

        if (vo.getPageIndex()<=0 || vo.getPageIndex() == null || vo.getPageSize() <= 0){
            vo.setPageIndex(1);
            vo.setPageSize(5);
        }
        PageHelper.startPage(vo.getPageIndex(),vo.getPageSize());
        List<CwOPayment> oPayments = oPaymentService.findCwOPaymentByPaymentVo(vo);
        PageInfo page = new PageInfo(oPayments, vo.getPageSize());

        return Response.ok().data("pageInfo",page);
    }

    @PostMapping("addOPayment")
    public void addOPayment(OPaymentInVo oPaymentInVo){

        oPaymentService.insertOPayment(oPaymentInVo);
    }

    @PutMapping("modifyOPayment")
    public void modifyOPayment(OPaymentInVo oPaymentInVo){

        oPaymentService.updateOPayment(oPaymentInVo);
    }

}
