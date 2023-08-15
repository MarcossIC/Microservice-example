package com.example.userservice.domain.service;

import com.example.userservice.domain.model.CarSaveDTO;

public interface CarServerClient {
    void saveCar(final CarSaveDTO carSaveDTO);
}
