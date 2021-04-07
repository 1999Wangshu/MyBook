package com.trkj.fanpu.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
//合同表实体类
public class CwContract {

  private Integer conId;
  private String conName;
  private Integer proId;
  private double conAmount;
  private double deposit;
  private Date conDate;
  private Date startDate;
  private Date endDate;
  private String signed; //签订人
  private Integer conStatus;
  private String remark;

  private ProjectEstablish projectEstablish;

}
