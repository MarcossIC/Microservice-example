package com.example.carservice.application.in;

import com.example.carservice.domain.model.Car;
import com.example.carservice.domain.service.RetrieveCarByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/cars")
@RequiredArgsConstructor
public class RetrieveCarByIdRest {
    private final RetrieveCarByIdService service;

    @GetMapping("/{id}")
    public HttpEntity<Car> retrieveCarById(@PathVariable("id") Long id){

        return ResponseEntity.ok(service.getCarById(id));
    }
}
