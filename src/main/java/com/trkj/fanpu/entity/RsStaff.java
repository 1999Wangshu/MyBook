package com.trkj.fanpu.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RsStaff {

  private Integer staffId;
  private Integer deptId;
  private Integer positionId;
  private String staffNum;
  private String staffPwd;
  private String staffName;
  private String staffSex;
  private String staffPhone;
  private String staffIdcard;
  private String staffState;
  private String staffType;
  private java.sql.Date entryTime;
  private String staffEmail;
  private String marriageState;
  private String education;
  private String staffNation;
  private java.sql.Date staffBirthday;
  private String politicalOutlook;
  private String major;
  private String homeAddress;



}
