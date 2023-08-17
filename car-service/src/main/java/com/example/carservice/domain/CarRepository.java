package com.example.carservice.domain;

import com.example.carservice.domain.model.Car;
import com.example.carservice.domain.model.CarSaveDTO;

import java.util.Set;

public interface CarRepository {

    Set<Car> getAllCars();

    Car getCarById(final Long ID);

    Car getCarByUserId(final String userId);


    void saveCar(final CarSaveDTO userSaveDTO);
}
