package com.ltm.sms.stumanagesystem.domain.entity;

import com.ltm.sms.stumanagesystem.common.BaseDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score extends BaseDomain {
    private Integer stuId;
    private String stuName;
    private Integer courseId;
    private String courseName;
    private Integer score;
    private String teacher;
}
