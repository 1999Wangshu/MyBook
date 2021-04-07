package com.trkj.fanpu.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ReceiptsInVo {

    private Integer receiptsId;
    private Integer conId;
    private String receiptsName;
    private BigDecimal conAmount;
    private BigDecimal receiptsAmount;
    private Integer staffId;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date receiptsDate;
    private Integer receiptsType;
    private Integer receiptsStatus = 1;
    private String remark;
}
