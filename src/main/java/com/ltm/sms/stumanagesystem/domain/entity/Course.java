package com.ltm.sms.stumanagesystem.domain.entity;

import com.ltm.sms.stumanagesystem.common.BaseDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course extends BaseDomain {
    private String courseName;
    private Integer stuNum;
    private String teacher ;
    private String courseDescr;
}
