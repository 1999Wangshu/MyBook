package com.trkj.fanpu.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
//付款表
public class CwPayment {

  private Integer payId;
  private Integer conId;
  private String payName;
  private double conAmount;
  private double payAmount;
  private double fine;
  private double deduction;
  @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
  private Date opayDate;
  private Integer staffId;
  private Integer payType;
  private Integer opayStatus;
  private String remark;

  private CwContract contract;
  private RsStaff rsStaff;


}
