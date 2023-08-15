package com.example.bikeservice.application.out;

import com.example.bikeservice.domain.BikeRepository;
import com.example.bikeservice.domain.model.Bike;
import com.example.bikeservice.domain.service.ListAllBikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public final class ListAllBikeServiceImpl implements ListAllBikeService {
    private final BikeRepository repository;

    public Set<Bike> getAllBikes(){
        return repository.getAllBikes();
    }

}
