package com.cargo.upload_car.service;

import com.cargo.upload_car.entity.Demo;
import org.omg.CORBA.Object;
import org.springframework.stereotype.Service;

/**
 * DemoService
 *
 * @blame Android Team
 * tk_mybatis 应用的学习
 *
 */


@Service
public interface DemoService {

    Demo getDemoById(int id);
    int addDemo(Demo demo);

    /**
     * 数据库：删除
     */
    int deleteById(int id);



    /**
     * 数据库：增加
     */
    int addInsertDemo(Demo demo);



    /**
     * 数据库：修改所有字段
     */
    int updateDemo(Demo demo);

    int XxzxxxxupdateDemo(String X111111);

    /**
     * 数据库：修改单个字段
     */
    int updateOne(Demo demo, Object object);



}
