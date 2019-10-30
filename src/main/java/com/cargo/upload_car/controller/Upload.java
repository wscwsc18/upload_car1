package com.cargo.upload_car.controller;

import com.cargo.upload_car.entity.Car;
import com.cargo.upload_car.service.IfiandID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("car")
@RestController
public class Upload {

    @Autowired
    public IfiandID ifiandID;

    @RequestMapping("upload")
    public List<Car> upload() {
        List<Car> cars = ifiandID.setConfig();
        return cars;

    }

    @RequestMapping("delete")
    public void deleteByCid(String cid) {
        ifiandID.deleteCarByCid(Integer.valueOf(cid));
    }
}
