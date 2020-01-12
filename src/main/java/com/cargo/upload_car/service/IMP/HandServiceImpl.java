package com.cargo.upload_car.service.IMP;

import com.cargo.upload_car.dao.toefl.HandMapper;
import com.cargo.upload_car.entity.Hand;
import com.cargo.upload_car.service.HandService;
import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * HandServiceImpl
 *
 * @blame Android Team
 */ //@Configuration
@Service
public class HandServiceImpl implements HandService {

    /**
     * HandMapper点的方法就是sql语句
     */
    @Autowired
    private HandMapper HandMapper;


    /**
     *根据id查询
     * @param id
     * @return
     */
    @Override
    public Hand getHandById(int id) {
        return HandMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addHand(Hand hand) {
        return HandMapper.insert(hand);
    }


    /**
     *根据id删除
     * @param id
     * @return
     */
    @Override
    public int deleteById(int id){
        return HandMapper.deleteByPrimaryKey(id);
    }

    /**
     *增加信息
     * @param
     * @return
     */
    @Override
    public int addInsertHand(Hand hand){

        return HandMapper.insert(hand);

    }

    /**
     * 修改所有信息
     * @param Hand
     * @return
     */
    @Override
    public int updateHand(Hand hand){
        return HandMapper.updateByPrimaryKey(hand);
    }

    /**
     * 修改单个字段
     */
    @Override
    public int updateOne(Hand hand,Object object) {
        return HandMapper.updateByExampleSelective(hand,object);
    }

    @Override
    public int XxzxxxxupdateHand(String X111111){

        System.out.println("\uD83D\uDE42\uD83D\uDE08\uD83D\uDC6D信息处理已经开始..." );
        return  8;
    }

}
