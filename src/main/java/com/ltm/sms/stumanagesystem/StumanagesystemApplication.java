package com.ltm.sms.stumanagesystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@MapperScan("com.ltm.sms.stumanagesystem.mapper")
public class StumanagesystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StumanagesystemApplication.class, args);
    }

}
