package com.cargo.upload_car;

import com.cargo.upload_car.entity.CarConfig;
import com.cargo.upload_car.mapper.FindCar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MappersTests {

    @Autowired
    public FindCar findCar;

    @Test
    public void find() {
        List<CarConfig> carConfigList = findCar.findTop200();
        System.err.println(carConfigList.size());
        for (CarConfig carConfig : carConfigList
        ) {
            System.err.println(carConfig);
        }
    }


    @Test
    public void findTopByNum(){
        Integer num = 3;
        List<CarConfig> carConfigList = findCar.findTopByNum(num);
        for (CarConfig carConfig : carConfigList
        ) {
            System.err.println(carConfig);
        }
    }

    @Test
    public void deleteByID(){
        Integer rows = findCar.deletById(25462010);
        System.err.println(rows);
    }
    @Test
    public void findAll(){
        List<CarConfig> carConfigList = findCar.findAll();
        for (CarConfig carConfig : carConfigList
        ) {
            System.err.println(carConfig);
        }
    }

}
