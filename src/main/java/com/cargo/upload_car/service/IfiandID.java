package com.cargo.upload_car.service;

import com.cargo.upload_car.entity.Car;
import com.cargo.upload_car.entity.CarConfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IfiandID {
    List<Car> setConfig();
    void sendCars(List<Car> cars);
    List<CarConfig> findTop200();
    void deleteCarByCid(Integer id);
}
