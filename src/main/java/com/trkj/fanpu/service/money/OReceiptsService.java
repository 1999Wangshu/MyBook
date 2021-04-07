package com.trkj.fanpu.service.money;


import com.trkj.fanpu.entity.CwOReceipts;
import com.trkj.fanpu.vo.OPaymentInVo;
import com.trkj.fanpu.vo.ReceiptsVo;

import java.util.List;

public interface OReceiptsService {


    List<CwOReceipts> findCwOReceiptsByReceiptsVo(ReceiptsVo receiptsVo);

    void insertOReceipts(OPaymentInVo oPaymentInVo);
}
