package com.trkj.fanpu.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.fanpu.entity.RsStaff;
import io.swagger.models.auth.In;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class OPaymentInVo {

    private Integer opayId;
    private Integer staffId;
    private String opayDetails;
    private double opayAmount;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date opayDate;
    private Integer opayStatus = 1;
    private String remark;

    private Integer oreceiptsId;

}
