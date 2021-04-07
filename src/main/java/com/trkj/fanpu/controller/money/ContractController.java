package com.trkj.fanpu.controller.money;

import com.trkj.fanpu.entity.CwContract;
import com.trkj.fanpu.service.money.ContractService;
import com.trkj.fanpu.utils.Response;
import com.trkj.fanpu.vo.ContractVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/con")
public class ContractController {


    @Autowired
    private ContractService contractService;

    @GetMapping("findContract")
    public Response findPaymentByPaymentVo(ContractVo vo){

        List<CwContract> contracts = contractService.findCwContractByContractVo(vo);
        return Response.ok().data("pageInfo",contracts);
    }

}
