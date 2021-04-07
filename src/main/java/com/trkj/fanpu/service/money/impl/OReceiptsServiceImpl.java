package com.trkj.fanpu.service.money.impl;

import com.trkj.fanpu.dao.money.OReceiptsMapper;
import com.trkj.fanpu.entity.CwOReceipts;
import com.trkj.fanpu.service.money.OReceiptsService;
import com.trkj.fanpu.vo.OPaymentInVo;
import com.trkj.fanpu.vo.ReceiptsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OReceiptsServiceImpl implements OReceiptsService {

    @Autowired
    private OReceiptsMapper oReceiptsMapper;

    @Override
    public List<CwOReceipts> findCwOReceiptsByReceiptsVo(ReceiptsVo receiptsVo) {

        return oReceiptsMapper.selectOReceiptsByReceiptsVo(receiptsVo);
    }

    @Override
    public void insertOReceipts(OPaymentInVo oPaymentInVo) {

        oReceiptsMapper.insertOReceipts(oPaymentInVo);
    }
}
