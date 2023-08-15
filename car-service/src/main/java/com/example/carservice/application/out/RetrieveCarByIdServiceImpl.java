package com.example.carservice.application.out;

import com.example.carservice.domain.CarRepository;
import com.example.carservice.domain.model.Car;
import com.example.carservice.domain.service.RetrieveCarByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public final class RetrieveCarByIdServiceImpl implements RetrieveCarByIdService {
    private final CarRepository repository;

    @Override
    public Car getCarById(final Long ID) {
        return repository.getCarById(ID);
    }
}
