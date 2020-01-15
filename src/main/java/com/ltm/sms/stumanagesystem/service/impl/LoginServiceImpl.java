package com.ltm.sms.stumanagesystem.service.impl;

import com.ltm.sms.stumanagesystem.domain.entity.User;
import com.ltm.sms.stumanagesystem.mapper.LoginMapper;
import com.ltm.sms.stumanagesystem.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginMapper loginMapper;
    @Override
    public boolean login(User user) {
        return this.loginMapper.login(user) > 1;
    }
}
