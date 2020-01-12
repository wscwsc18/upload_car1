package com.cargo.upload_car.service;

import com.cargo.upload_car.entity.Car;
import com.cargo.upload_car.entity.CarConfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IfiandID {


    public abstract List<Car> setConfig();
    public abstract int  sendCars(List<Car> cars);
    public abstract List<CarConfig> findTop200();
    public abstract List<CarConfig> findTop1();

    public abstract     void deleteCarByCid(Integer id);
    public abstract void deletByIdless(Integer id);
}
