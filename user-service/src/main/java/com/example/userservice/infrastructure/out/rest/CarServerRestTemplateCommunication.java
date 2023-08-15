package com.example.userservice.infrastructure.out.rest;

import com.example.userservice.domain.model.CarSaveDTO;
import com.example.userservice.domain.service.CarServerCommunication;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
@RequiredArgsConstructor
public class CarServerRestTemplateCommunication implements CarServerCommunication {
    private final RestTemplate restTemplate;

    private static final String CARS_URI= "http://localhost:8002/cars";

    @Override
    public void saveCar(CarSaveDTO carSaveDTO) {
        restTemplate.postForObject(URI.create(CARS_URI), carSaveDTO, Void.class);
    }
}
