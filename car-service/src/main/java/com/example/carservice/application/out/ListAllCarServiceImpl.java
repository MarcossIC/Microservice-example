package com.example.carservice.application.out;

import com.example.carservice.domain.CarRepository;
import com.example.carservice.domain.model.Car;
import com.example.carservice.domain.service.ListAllCarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public final class ListAllCarServiceImpl implements ListAllCarService {
    private final CarRepository repository;

    public Set<Car> getAllCars(){
        return repository.getAllCars();
    }

}
