package com.example.carservice.application.usecase;

import com.example.carservice.domain.CarRepository;
import com.example.carservice.domain.model.Car;
import com.example.carservice.domain.usecase.ListAllCarUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public final class ListAllCarUseCaseImp implements ListAllCarUseCase {
    private final CarRepository repository;

    public Set<Car> getAllCars() {
        return repository.getAllCars();
    }

}
