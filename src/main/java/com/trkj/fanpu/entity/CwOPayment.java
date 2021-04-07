package com.trkj.fanpu.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
//其他付款
public class CwOPayment {

  private Integer opayId;
  private String opayDetails;
  private double opayAmount;
  @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
  private Date opayDate;
  private Integer opayStatus;
  private String remark;

  private RsStaff rsStaff;

}
