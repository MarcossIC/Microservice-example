package com.example.bikeservice.domain.service;

import com.example.bikeservice.domain.model.Bike;

public interface RetrieveBikeByIdService {

    Bike getBikeById(final Long ID);
}
