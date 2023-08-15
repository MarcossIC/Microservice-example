package com.example.carservice.domain.service;

import com.example.carservice.domain.model.Car;

public interface RetrieveCarByIdService {

    Car getCarById(final Long ID);
}
