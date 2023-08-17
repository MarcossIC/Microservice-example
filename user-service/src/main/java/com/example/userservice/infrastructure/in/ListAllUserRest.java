package com.example.userservice.infrastructure.in;

import com.example.userservice.domain.model.User;
import com.example.userservice.domain.usecase.ListAllUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class ListAllUserRest {
    private final ListAllUserService service;

    @GetMapping
    public HttpEntity<Set<User>> listAllUsers(){
        var response = service.getAllUser();
        return response.isEmpty()
                ? ResponseEntity.noContent().build()
                : ResponseEntity.ok(response);
    }
}
