package com.trkj.fanpu.dao.money;

import com.trkj.fanpu.entity.CwContract;
import com.trkj.fanpu.vo.ContractVo;

import java.util.List;

public interface ContractMapper {

    List<CwContract> selectContractByContractVo(ContractVo contract);
}
