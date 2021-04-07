package com.trkj.fanpu.service.money.impl;

import com.sun.org.apache.regexp.internal.RE;
import com.trkj.fanpu.dao.money.ReceiptsMapper;
import com.trkj.fanpu.entity.CwReceipts;
import com.trkj.fanpu.service.money.ReceiptsService;
import com.trkj.fanpu.vo.ReceiptsInVo;
import com.trkj.fanpu.vo.ReceiptsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiptsServiceImpl implements ReceiptsService {

    @Autowired
    private ReceiptsMapper receiptsMapper;
    @Override
    public List<CwReceipts> findCwReceiptsByReceiptsVo(ReceiptsVo receiptsVo) {

        return receiptsMapper.selectReceiptsByReceiptsVo(receiptsVo);
    }

    @Override
    public void insertReceipts(ReceiptsInVo receiptsInVo) {
        receiptsMapper.insertReceipts(receiptsInVo);
    }
}
