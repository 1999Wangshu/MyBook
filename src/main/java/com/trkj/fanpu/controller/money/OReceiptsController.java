package com.trkj.fanpu.controller.money;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.fanpu.entity.CwOReceipts;
import com.trkj.fanpu.service.money.OReceiptsService;
import com.trkj.fanpu.utils.Response;
import com.trkj.fanpu.vo.OPaymentInVo;
import com.trkj.fanpu.vo.ReceiptsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ore")
public class OReceiptsController {

    @Autowired
    private OReceiptsService oReceiptsService;

    @GetMapping("findOReceipts")
    public Response findOReceiptsByReceiptsVo(ReceiptsVo vo){

        if (vo.getPageIndex() <=0 || vo.getPageIndex()==null || vo.getPageSize() <=0){
            vo.setPageIndex(1);
            vo.setPageSize(5);
        }
        PageHelper.startPage(vo.getPageIndex(),vo.getPageSize());
        List<CwOReceipts> oreceipts = oReceiptsService.findCwOReceiptsByReceiptsVo(vo);
        PageInfo page = new PageInfo(oreceipts, vo.getPageSize());

        return Response.ok().data("pageInfo",page);
    }

    @PostMapping("addOReceipts")
    public void addOReceipts(OPaymentInVo oPaymentInVo){
        oReceiptsService.insertOReceipts(oPaymentInVo);

    }
}
