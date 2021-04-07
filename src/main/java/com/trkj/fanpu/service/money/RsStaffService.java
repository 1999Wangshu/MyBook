package com.trkj.fanpu.service.money;

import com.trkj.fanpu.entity.RsStaff;
import com.trkj.fanpu.vo.ParamVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RsStaffService {

    List<RsStaff> getRsStaffAll(ParamVo paramVo);

    Integer addStaff(RsStaff rsStaff,Integer deptId, Integer positionId);

    Integer updateStaffById(RsStaff rsStaff, Integer deptId, Integer positionId);
}
