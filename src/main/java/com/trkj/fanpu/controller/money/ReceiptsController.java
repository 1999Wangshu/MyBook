package com.trkj.fanpu.controller.money;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.fanpu.entity.CwReceipts;
import com.trkj.fanpu.service.money.ReceiptsService;
import com.trkj.fanpu.utils.Response;
import com.trkj.fanpu.vo.ReceiptsInVo;
import com.trkj.fanpu.vo.ReceiptsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/re")
public class ReceiptsController {


    @Autowired
    private ReceiptsService receiptsService;
    @GetMapping("findReceipts")
    public Response findCWReceiptsByReceiptstVo(ReceiptsVo vo){

        System.out.println(vo);
        if (vo.getPageIndex() <=0 || vo.getPageIndex()==null || vo.getPageSize() <=0){
            vo.setPageIndex(1);
            vo.setPageSize(5);
        }
        PageHelper.startPage(vo.getPageIndex(),vo.getPageSize());
        List<CwReceipts> receipts =receiptsService.findCwReceiptsByReceiptsVo(vo);
        PageInfo page = new PageInfo(receipts, vo.getPageSize());

        return Response.ok().data("pageInfo",page);
    }

    @PostMapping("addReceipts")
    public void addReceipts(ReceiptsInVo receiptsInVo){

        System.out.println(">>>>"+ receiptsInVo);
        receiptsService.insertReceipts(receiptsInVo);
    }


}
