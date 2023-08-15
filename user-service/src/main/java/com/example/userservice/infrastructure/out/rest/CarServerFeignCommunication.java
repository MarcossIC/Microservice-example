package com.example.userservice.infrastructure.out.rest;

import com.example.userservice.domain.model.CarSaveDTO;
import com.example.userservice.domain.service.CarServerCommunication;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CarServerFeignCommunication implements CarServerCommunication {
    private final CarFeignClient client;

    @Override
    public void saveCar(CarSaveDTO carSaveDTO) {
        client.saveCar(carSaveDTO);
    }
}
