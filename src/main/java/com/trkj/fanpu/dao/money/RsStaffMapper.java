package com.trkj.fanpu.dao.money;

import com.trkj.fanpu.entity.RsStaff;
import com.trkj.fanpu.vo.ParamVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RsStaffMapper {

    List<RsStaff> getRsStaffAll(ParamVo paramVo);

    Integer addStaff(@Param("rsStaff") RsStaff rsStaff, @Param("deptId") Integer deptId, @Param("positionId") Integer positionId);

    Integer updateStaffById(@Param("rsStaff") RsStaff rsStaff, @Param("deptId") Integer deptId, @Param("positionId") Integer positionId);
}
