package com.example.carservice.application.in;

import com.example.carservice.domain.model.Car;
import com.example.carservice.domain.service.RetrieveByUserIdService;
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
public class RetrieveByUserId {
    private final RetrieveByUserIdService service;

    @GetMapping("/users/{id}")
    public HttpEntity<Car> retrieveCarByUserId(@PathVariable("id") String id){

        return ResponseEntity.ok(service.getByUserId(id));
    }
}
