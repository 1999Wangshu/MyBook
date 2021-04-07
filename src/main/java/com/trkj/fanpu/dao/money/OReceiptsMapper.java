package com.trkj.fanpu.dao.money;

import com.trkj.fanpu.entity.CwOReceipts;
import com.trkj.fanpu.vo.OPaymentInVo;
import com.trkj.fanpu.vo.ReceiptsVo;

import java.util.List;

public interface OReceiptsMapper {

    List<CwOReceipts> selectOReceiptsByReceiptsVo(ReceiptsVo receiptsVo);

    void insertOReceipts(OPaymentInVo oPaymentInVo);
}
