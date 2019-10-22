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
        for (CarConfig carConfig : carConfigList
        ) {
            System.err.println(carConfig);
        }
    }

}
