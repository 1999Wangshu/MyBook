package com.trkj.fanpu.controller;

import com.trkj.fanpu.entity.RsStaff;
import com.trkj.fanpu.service.money.RsStaffService;
import com.trkj.fanpu.utils.Response;
import com.trkj.fanpu.vo.ParamVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class RsStaffController {

    @Autowired
    private RsStaffService rsStaffService;

    /**
     * 查询员工信息
     * @return
     */
    @GetMapping("/getStaffAll")
    public Response getStaffAll(ParamVo paramVo) {
        try {
            List<RsStaff> rsStaffAll = rsStaffService.getRsStaffAll(paramVo);
            return Response.ok().data("rsStaffAll",rsStaffAll);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Response.error();
    }

    /**
     * 添加员工
     * @param rsStaff
     * @return
     */
    @PostMapping("/addStaff")
    public Response addStaff(RsStaff rsStaff,Integer deptId, Integer positionId) {
        try {
            rsStaffService.addStaff(rsStaff, deptId, positionId);
            return Response.ok();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Response.error();
    }

    /**
     * 修改员工信息
     * @param rsStaff
     * @param deptId
     * @param positionId
     * @return
     */
    @PostMapping("/updateStaffById")
    public Response updateStaffById(RsStaff rsStaff,Integer deptId, Integer positionId) {
        try {
            rsStaffService.updateStaffById(rsStaff, deptId, positionId);
            return Response.ok();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Response.error();
    }
}
