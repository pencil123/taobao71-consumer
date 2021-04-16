package com.taobao71.tb71consumer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.taobao71.tb71consumer.mapper")
public class Tb71ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tb71ConsumerApplication.class, args);
    }
}
