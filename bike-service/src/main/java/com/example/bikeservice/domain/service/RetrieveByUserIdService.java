package com.example.bikeservice.domain.service;


import com.example.bikeservice.domain.model.Bike;

public interface RetrieveByUserIdService {
    Bike getBikeByUserId(final String userId);
}
