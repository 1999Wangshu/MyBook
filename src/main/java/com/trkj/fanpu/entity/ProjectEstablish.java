package com.trkj.fanpu.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectEstablish {

  private Integer proId;
  private Integer planId;
  private Integer ropId;
  private String proName;
  private java.sql.Date proPlanStart;
  private java.sql.Date proPlanEnd;
  private String proAddress;
  private String proZone;
  private Integer proPeriod;
  private double proCost;
  private double proExpectedProfit;
  private String proType;
  private String proQualityGrade;
  private Integer proStatus;
  private String proUname;
  private java.sql.Date proDate;
  private String proUnitBuild;
  private String proUnitContacts;
  private String proUnitContactsWay;
  private String proUntiAddress;
  private String proStaffName;
  private String proRemarks;



}
