package com.example.bikeservice.application.out;

import com.example.bikeservice.domain.BikeRepository;
import com.example.bikeservice.domain.model.Bike;
import com.example.bikeservice.domain.service.RetrieveByUserIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RetrieveByUserIdServiceImpl implements RetrieveByUserIdService {
    private final BikeRepository repository;

    @Override
    public Bike getBikeByUserId(final String userId) {
        return repository.getBikeByUserId(userId);
    }
}
