package com.ltm.sms.stumanagesystem.domain.entity;

import com.ltm.sms.stumanagesystem.common.BaseDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseDomain {
    private String userName;
    private String passWord;
}
