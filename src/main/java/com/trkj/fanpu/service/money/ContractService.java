package com.trkj.fanpu.service.money;

import com.trkj.fanpu.entity.CwContract;
import com.trkj.fanpu.vo.ContractVo;

import java.util.List;

public interface ContractService {


    List<CwContract> findCwContractByContractVo(ContractVo contractVo);
}
