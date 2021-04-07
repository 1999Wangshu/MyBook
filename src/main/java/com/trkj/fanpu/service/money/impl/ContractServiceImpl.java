package com.trkj.fanpu.service.money.impl;

import com.trkj.fanpu.dao.money.ContractMapper;
import com.trkj.fanpu.entity.CwContract;
import com.trkj.fanpu.service.money.ContractService;
import com.trkj.fanpu.vo.ContractVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    private ContractMapper contractMapper;

    @Override
    public List<CwContract> findCwContractByContractVo(ContractVo contractVo) {

        return contractMapper.selectContractByContractVo(contractVo);
    }
}
