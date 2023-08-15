package com.example.userservice.domain.service;

import com.example.userservice.domain.model.CarSaveDTO;

public interface CarServerCommunication {
    void saveCar(final CarSaveDTO carSaveDTO);
}
