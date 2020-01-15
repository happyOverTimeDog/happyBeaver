package com.ltm.sms.stumanagesystem.controller;

import com.ltm.sms.stumanagesystem.domain.entity.ResInfo;
import com.ltm.sms.stumanagesystem.domain.entity.User;
import com.ltm.sms.stumanagesystem.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @description: 登录
 * @author: ltm
 * @create: 2019-12-23 12:13
 */
@Slf4j
@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "*", maxAge = 3600)
public class LoginController {

    @Resource
    private LoginService loginService;

    @GetMapping
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return "hello";
    }

    @RequestMapping
    public ResponseEntity<ResInfo> login(@RequestBody User user) {
        try {
            if (this.loginService.login(user)) {
                return ResponseEntity.ok(new ResInfo("00", "登录成功"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok(new ResInfo("01", "登录失败"));
    }
}
