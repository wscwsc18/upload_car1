package com.cargo.upload_car.service;

import com.cargo.upload_car.entity.Hand;
import org.omg.CORBA.Object;
import org.springframework.stereotype.Service;

/**
 * HandService
 *
 * @blame Android Team
 * tk_mybatis 应用的学习
 *
 */


@Service
public interface HandService {

    Hand getHandById(int id);
    int addHand(Hand hand);


    /**
     * 数据库：删除
     */
    int deleteById(int id);



    /**
     * 数据库：增加
     */
    int addInsertHand(Hand hand);



    /**
     * 数据库：修改所有字段
     */
    int updateHand(Hand and);

    int XxzxxxxupdateHand(String X111111);

    /**
     * 数据库：修改单个字段
     */
    int updateOne(Hand hand, Object object);



}
