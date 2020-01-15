package com.ltm.sms.stumanagesystem.mapper;

import com.ltm.sms.stumanagesystem.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    Integer login(User user);
}
