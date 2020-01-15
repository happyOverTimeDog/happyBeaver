package com.ltm.sms.stumanagesystem.common;

import lombok.Data;

import java.util.Date;

@Data
public class BaseDomain {
    private Long id;
    private Date createTime;
    private String createUser;
    private int isDelete;
}
