package com.cargo.upload_car.dao.ielts;

import com.cargo.upload_car.entity.CarConfig;
import com.cargo.upload_car.entity.Hand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 搭建springboot的ssm(spring + springmvc + mybatis)的maven项目
 * https://www.cnblogs.com/chenlove/p/9193052.html
 */
@Mapper   //可以加上也可以去掉
public interface FindCar {



    List<CarConfig> findTop200();
    List<CarConfig> findTop1();

    //List<CarConfig> findTopByNum(Integer num);

    Hand ShakehandSQL();

    Integer deletById(Integer id);

    Integer  deletByIdless(Integer id);
    /**
     * 查找所有数据
     */

    List<CarConfig> findAll();
}


