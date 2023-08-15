package com.example.bikeservice.application.in;

import com.example.bikeservice.domain.model.Bike;
import com.example.bikeservice.domain.service.ListAllBikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("api/v1/bikes")
@RequiredArgsConstructor
public class ListAllBikeRest {
    private final ListAllBikeService service;

    @GetMapping
    public HttpEntity<Set<Bike>> listAllBikes(){
        var response = service.getAllBikes();
        return response.isEmpty()
                ? ResponseEntity.noContent().build()
                : ResponseEntity.ok(response);
    }
}
