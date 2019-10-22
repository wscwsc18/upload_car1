package com.cargo.upload_car.service;

import com.cargo.upload_car.entity.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IfiandID {
    List<Car> setConfig();

    void sendCars(List<Car> cars);
}
