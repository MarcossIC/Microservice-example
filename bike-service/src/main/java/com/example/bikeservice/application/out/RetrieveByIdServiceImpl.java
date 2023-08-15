package com.example.bikeservice.application.out;

import com.example.bikeservice.domain.BikeRepository;
import com.example.bikeservice.domain.model.Bike;
import com.example.bikeservice.domain.service.RetrieveBikeByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public final class RetrieveByIdServiceImpl implements RetrieveBikeByIdService {
    private final BikeRepository repository;

    @Override
    public Bike getBikeById(final Long ID) {
        return repository.getBikeById(ID);
    }
}
