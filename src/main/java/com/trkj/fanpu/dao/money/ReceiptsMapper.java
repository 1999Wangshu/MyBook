package com.trkj.fanpu.dao.money;

import com.trkj.fanpu.entity.CwReceipts;
import com.trkj.fanpu.vo.ReceiptsInVo;
import com.trkj.fanpu.vo.ReceiptsVo;

import java.util.List;

public interface ReceiptsMapper {

    List<CwReceipts> selectReceiptsByReceiptsVo(ReceiptsVo receiptsVo);

    void insertReceipts(ReceiptsInVo receiptsInVo);
}
