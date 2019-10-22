package com.cargo.upload_car.serviceTests;

import com.cargo.upload_car.service.IfiandID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class findServiceTest {

    @Autowired
    public IfiandID ifiandID;

    @Test
    public void findTop20001(){
        ifiandID.sendCars(ifiandID.setConfig());
    }
}
