package com.example.userservice.infrastructure.out.clients.feign;

import com.example.userservice.domain.model.CarSaveDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "car-service", url = "localhost:8002")
public interface CarFeignClient {
    @PostMapping(value = "/api/v1/cars")
    Void saveCar(@RequestBody CarSaveDTO dto);
}
