package com.example.carservice.domain.usecase;

import com.example.carservice.domain.model.Car;

public interface RetrieveCarByIdService {

    Car getCarById(final Long ID);
}
