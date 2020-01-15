package com.ltm.sms.stumanagesystem.domain.entity;

import com.ltm.sms.stumanagesystem.common.BaseDomain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @description: 学生类
 * @author: ltm
 * @create: 2019-12-23 12:26
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student  extends BaseDomain {
    private String stuName;
    private Integer stuAge;
    private String stuClass;
    private Integer score;
    private String hobby;
    private List<String> course;
    private List<String> scores;
    private Date entryTime;
    private String mathScore;
    private String englishScore;
    private String writingScore;
    private Date beginTime;
    private Date endTime;
    private String courseName;
}
