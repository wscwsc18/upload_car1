package com.cargo.upload_car;

import com.cargo.upload_car.entity.Car;
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
public class UploadTests {

    @Autowired
    public FindCar findCar;

    @Test
    public void uploadTop200() {
        List<CarConfig> list = findCar.findTop200();
        Car car = new Car();
        for (CarConfig cars : list) {



        }

    }

}
