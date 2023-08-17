package com.example.userservice.infrastructure.out.clients.exchange;

import com.example.userservice.domain.model.CarSaveDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange
public interface CarExchangeClient {
    @PostExchange(value = "/api/v1/cars")
    Void saveCar(@RequestBody CarSaveDTO dto);
}
