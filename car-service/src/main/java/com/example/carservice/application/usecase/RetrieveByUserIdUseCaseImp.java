package com.example.carservice.application.usecase;

import com.example.carservice.domain.CarRepository;
import com.example.carservice.domain.model.Car;
import com.example.carservice.domain.usecase.RetrieveByUserIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RetrieveByUserIdUseCaseImp implements RetrieveByUserIdUseCase {
    private final CarRepository repository;

    @Override
    public Car getByUserId(final String userId) {
        return repository.getCarByUserId(userId);
    }
}
