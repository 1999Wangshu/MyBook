package com.trkj.fanpu.vo;

import com.trkj.fanpu.base.BasePage;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ReceiptsVo extends BasePage {

    private String receiptsName;
    private String conName;
    private String staffName;
    private Integer receiptsStatus;
    private BigDecimal receiptsAmountStart;
    private BigDecimal receiptsAmountEnd;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;
}
