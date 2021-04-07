package com.trkj.fanpu.service.money;

import com.trkj.fanpu.entity.CwPayment;
import com.trkj.fanpu.entity.CwReceipts;
import com.trkj.fanpu.vo.ReceiptsInVo;
import com.trkj.fanpu.vo.ReceiptsVo;

import java.util.List;

public interface ReceiptsService {


    List<CwReceipts> findCwReceiptsByReceiptsVo(ReceiptsVo receiptsVo);

    void insertReceipts(ReceiptsInVo receiptsInVo);
}
