package com.example.bikeservice.application.in;

import com.example.bikeservice.domain.model.Bike;
import com.example.bikeservice.domain.service.RetrieveByUserIdService;
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
public class RetrieveByUserIdRest {
    private final RetrieveByUserIdService service;

    @GetMapping("/users/{id}")
    public HttpEntity<Bike> retrieveBikeByUserId(@PathVariable("id") String id){

        return ResponseEntity.ok( service.getBikeByUserId( id ) );
    }
}
