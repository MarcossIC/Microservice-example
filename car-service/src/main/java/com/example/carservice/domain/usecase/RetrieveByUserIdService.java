package com.example.carservice.domain.usecase;

import com.example.carservice.domain.model.Car;

public interface RetrieveByUserIdService {
    Car getByUserId(final String userId);
}
