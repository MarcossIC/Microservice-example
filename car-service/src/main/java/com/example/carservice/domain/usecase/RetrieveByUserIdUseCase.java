package com.example.carservice.domain.usecase;

import com.example.carservice.domain.model.Car;

public interface RetrieveByUserIdUseCase {
    Car getByUserId(final String userId);
}
