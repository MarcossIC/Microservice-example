package com.example.carservice.application.out;

import com.example.carservice.domain.CarRepository;
import com.example.carservice.domain.model.Car;
import com.example.carservice.domain.service.RetrieveByUserIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RetrieveByUserIdServiceImpl implements RetrieveByUserIdService {
    private final CarRepository repository;

    @Override
    public Car getByUserId(final String userId) {
        return repository.getCarByUserId(userId);
    }
}
