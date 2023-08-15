package com.example.bikeservice.domain;

import com.example.bikeservice.domain.model.Bike;
import com.example.bikeservice.domain.model.BikeSaveDTO;

import java.util.Set;

public interface BikeRepository {

    Set<Bike> getAllBikes();

    Bike getBikeById(final Long ID);
    Bike getBikeByUserId(final String userId);


    void saveBike(final BikeSaveDTO bikeSaveDTO);
}
