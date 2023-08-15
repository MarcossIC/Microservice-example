package com.example.carservice.domain.usecase;

import com.example.carservice.domain.model.CarSaveDTO;

public interface SaveCarService {

    void saveCar(CarSaveDTO userSaveDTO);
}
