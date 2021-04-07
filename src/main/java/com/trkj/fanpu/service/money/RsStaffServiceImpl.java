package com.trkj.fanpu.service.money;

import com.trkj.fanpu.dao.money.RsStaffMapper;
import com.trkj.fanpu.entity.RsStaff;
import com.trkj.fanpu.vo.ParamVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RsStaffServiceImpl implements RsStaffService {

    @Autowired
    private RsStaffMapper rsStaffMapper;

    @Override
    public List<RsStaff> getRsStaffAll(ParamVo paramVo) {
        return rsStaffMapper.getRsStaffAll(paramVo);
    }

    @Override
    public Integer addStaff(RsStaff rsStaff, Integer deptId, Integer positionId) {
        rsStaff.setStaffPwd("123456");
        rsStaff.setStaffState("在职");
        return rsStaffMapper.addStaff(rsStaff,deptId,positionId);
    }

    @Override
    public Integer updateStaffById(RsStaff rsStaff, Integer deptId, Integer positionId) {
        return rsStaffMapper.updateStaffById(rsStaff,deptId,positionId);
    }
}
