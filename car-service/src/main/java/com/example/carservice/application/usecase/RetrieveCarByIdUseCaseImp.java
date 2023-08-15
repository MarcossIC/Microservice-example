package com.example.carservice.application.usecase;

import com.example.carservice.domain.CarRepository;
import com.example.carservice.domain.model.Car;
import com.example.carservice.domain.usecase.RetrieveCarByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public final class RetrieveCarByIdUseCaseImp implements RetrieveCarByIdService {
    private final CarRepository repository;

    @Override
    public Car getCarById(final Long ID) {
        return repository.getCarById(ID);
    }
}
