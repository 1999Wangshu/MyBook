package com.trkj.fanpu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan(basePackages = {"com.trkj.fanpu.dao"})
public class FanpuApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanpuApplication.class, args);
    }

}
