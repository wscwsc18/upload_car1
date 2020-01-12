package com.cargo.upload_car.service.IMP;


import com.cargo.upload_car.dao.toefl.DemoMapper;
import com.cargo.upload_car.entity.Demo;
import com.cargo.upload_car.service.DemoService;
import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DemoServiceImpl
 *
 * @blame Android Team
 */ //@Configuration
@Service
public class DemoServiceImpl implements DemoService {

    /**
     * demoMapper点的方法就是sql语句
     */
    @Autowired
    private DemoMapper demoMapper;


    /**
     *根据id查询
     * @param id
     * @return
     */
    @Override
    public Demo getDemoById(int id) {
        return demoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addDemo(Demo demo) {
        return demoMapper.insert(demo);
    }


    /**
     *根据id删除
     * @param id
     * @return
     */
    @Override
    public int deleteById(int id){
        return demoMapper.deleteByPrimaryKey(id);
    }

    /**
     *增加信息
     * @param
     * @return
     */
    @Override
    public int addInsertDemo(Demo demo){

        return demoMapper.insert(demo);

    }

    /**
     * 修改所有信息
     * @param demo
     * @return
     */
    @Override
    public int updateDemo(Demo demo){
        return demoMapper.updateByPrimaryKey(demo);
    }

    /**
     * 修改单个字段
     */
    @Override
    public int updateOne(Demo demo,Object object) {
        return demoMapper.updateByExampleSelective(demo,object);
    }

    @Override
    public int XxzxxxxupdateDemo(String X111111){

        System.out.println("\uD83D\uDE42\uD83D\uDE08\uD83D\uDC6D信息处理已经开始..." );
        return  8;
    }

}
