package com.trkj.fanpu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 通用参数vo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParamVo {
    private Integer id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date timeStart;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date timeEnd;
    private String name;
    private Integer pagenum;
    private Integer pagesize;
    private Integer[] ids;
    private String[] names;
    private Integer type;
    private Integer nums;
    private Double store;
    private String paperType;
    private String name2;
}
