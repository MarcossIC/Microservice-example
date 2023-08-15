package com.example.userservice.infrastructure.out.rest;

import com.example.userservice.domain.model.CarSaveDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "car-service", url = "http://localhost:8002")
public interface CarFeignClient {
    @PostMapping(value = "/api/v1/cars")
    Void saveCar(@RequestBody CarSaveDTO dto);
}
