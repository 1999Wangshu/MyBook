package com.trkj.fanpu.vo;

import com.trkj.fanpu.base.BasePage;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ToString
public class PaymentVo extends BasePage {

    private String payName;
    private String conName;
    private String staffName;
    private Integer opayStatus;
    private BigDecimal payAmountStart;
    private BigDecimal payAmountEnd;

}
