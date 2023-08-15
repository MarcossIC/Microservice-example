package com.example.carservice.domain.service;

import com.example.carservice.domain.model.Car;

public interface RetrieveByUserIdService {
    Car getByUserId(final String userId);
}
