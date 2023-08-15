package com.example.bikeservice.application.in;

import com.example.bikeservice.domain.model.BikeSaveDTO;
import com.example.bikeservice.domain.service.SaveBikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("api/v1/bikes")
@RequiredArgsConstructor
public class SaveBikeRest {

    private final SaveBikeService service;

    @PostMapping
    public HttpEntity<Void> saveBike(@RequestBody BikeSaveDTO dto){
        service.saveBike(dto);
        return ResponseEntity.created(URI.create("/api/v1/bikes")).build();
    }
}
