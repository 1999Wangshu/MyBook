package com.trkj.fanpu.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
//其他收款
public class CwOReceipts {

  private Integer oreceiptsId;
  private String oreceiptsDetails;
  private double oreceiptsAmount;
  private Date oreceiptsDate;
  private Integer oreceiptsStatus;
  private String remark;

  private RsStaff rsStaff;


}
