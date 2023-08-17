package com.example.carservice.infrastructure.in;

import com.example.carservice.domain.model.Car;
import com.example.carservice.domain.usecase.ListAllCarUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/cars")
@RequiredArgsConstructor
public class ListAllCarRest {
    private final ListAllCarUseCase service;

    @GetMapping()
    public HttpEntity<Set<Car>> listAllCars() {
        var response = service.getAllCars();
        return response.isEmpty()
                ? ResponseEntity.noContent().build()
                : ResponseEntity.ok(response);
    }
}
