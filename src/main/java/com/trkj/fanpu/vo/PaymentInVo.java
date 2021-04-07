package com.trkj.fanpu.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PaymentInVo {

    private Integer payId;
    private String payName;
    private String conName;
    private String conId;
    private BigDecimal conAmount;
    private BigDecimal payAmount;
    private BigDecimal fine;
    private BigDecimal deduction;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date opayDate;
    private Integer staffId;
    private Integer payType;
    private String remark;
    private String staffName;
    private Integer oPayStatus = 1;
}
