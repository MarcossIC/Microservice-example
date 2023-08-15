package com.example.bikeservice.application.in;

import com.example.bikeservice.domain.model.Bike;
import com.example.bikeservice.domain.service.RetrieveBikeByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/bikes")
@RequiredArgsConstructor
public class RetrieveByIdRest {
    private final RetrieveBikeByIdService service;

    @GetMapping("/{id}")
    public HttpEntity<Bike> retrieveBikeById(@PathVariable("id") Long id){

        return ResponseEntity.ok(service.getBikeById(id));
    }
}
