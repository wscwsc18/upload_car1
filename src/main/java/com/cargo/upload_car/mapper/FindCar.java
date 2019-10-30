package com.cargo.upload_car.mapper;

import com.cargo.upload_car.entity.CarConfig;
import com.cargo.upload_car.entity.HandSQL;

import java.util.List;

/**
 * 搭建springboot的ssm(spring + springmvc + mybatis)的maven项目
 * https://www.cnblogs.com/chenlove/p/9193052.html
 */

public interface FindCar {
    List<CarConfig> findTop200();

    List<CarConfig> findTopByNum(Integer num);
    HandSQL ShakehandSQL();
    Integer deletById(Integer id);
    /**
     * 查找所有数据
     */
    List<CarConfig> findAll();
}


