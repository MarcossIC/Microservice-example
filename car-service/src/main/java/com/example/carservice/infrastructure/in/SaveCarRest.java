package com.example.carservice.infrastructure.in;

import com.example.carservice.domain.model.CarSaveDTO;
import com.example.carservice.domain.usecase.SaveCarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/cars")
@RequiredArgsConstructor
public class SaveCarRest {

    private final SaveCarService service;

    @PostMapping
    public HttpEntity<Void> saveCar(@RequestBody CarSaveDTO dto) {
        service.saveCar(dto);
        return ResponseEntity.created(URI.create("/api/v1/cars")).build();
    }
}
