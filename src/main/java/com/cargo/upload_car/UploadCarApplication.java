package com.cargo.upload_car;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cargo.upload_car.mapper")
public class UploadCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(UploadCarApplication.class, args);
    }

}
