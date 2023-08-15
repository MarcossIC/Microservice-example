package com.example.carservice.application.in;

import com.example.carservice.domain.model.Car;
import com.example.carservice.domain.model.CarSaveDTO;
import com.example.carservice.domain.service.SaveCarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.Set;

@RestController
@RequestMapping("api/v1/cars")
@RequiredArgsConstructor
public class SaveCarRest {

    private final SaveCarService service;

    @PostMapping
    public HttpEntity<Void> saveCar(@RequestBody CarSaveDTO dto){
        service.saveCar(dto);
        return ResponseEntity.created(URI.create("/api/v1/cars")).build();
    }
}
