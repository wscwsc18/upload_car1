package com.cargo.upload_car.mapper;


import com.cargo.upload_car.entity.CarConfig;
import com.cargo.upload_car.entity.HandSQL;
import java.util.List;
//搭建springboot的ssm(spring + springmvc + mybatis)的maven项目
//https://www.cnblogs.com/chenlove/p/9193052.html
public interface FindCar {
    List<CarConfig> findTop200();

    HandSQL ShakehandSQL();
}
