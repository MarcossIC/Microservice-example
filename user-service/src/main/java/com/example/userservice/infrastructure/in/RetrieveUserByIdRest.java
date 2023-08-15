package com.example.userservice.infrastructure.in;

import com.example.userservice.domain.model.User;
import com.example.userservice.domain.usecase.RetrieveUserByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class RetrieveUserByIdRest {
    private final RetrieveUserByIdService service;

    @GetMapping("/{id}")
    public HttpEntity<User> retrieveUserById(@PathVariable("id") Long id){

        return ResponseEntity.ok(service.getUserById(id));
    }
}
