package com.trkj.fanpu.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
//合同收款
public class CwReceipts {

  private Integer receiptsId;
  private Integer conId;
  private String receiptsName;
  private double conAmount;
  private double receiptsAmount;
  private Integer staffId;
  private Date receiptsDate;
  private Integer receiptsType;
  private Integer receiptsStatus;
  private String remark;

  private CwContract contract;
  private RsStaff rsStaff;

}
