package com.example.carservice.domain.usecase;

import com.example.carservice.domain.model.Car;

import java.util.Set;

public interface ListAllCarUseCase {
    Set<Car> getAllCars();
}
