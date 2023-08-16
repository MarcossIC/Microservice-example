package com.example.userservice.infrastructure.in;

import com.example.userservice.domain.model.User;
import com.example.userservice.domain.model.UserSaveDTO;
import com.example.userservice.domain.usecase.SaveUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Set;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class SaveUserRest {
    private final SaveUserService service;

    @PostMapping
    public HttpEntity<Set<User>> listAllUsers(@RequestBody UserSaveDTO dto){
        service.saveUser(dto);
        return ResponseEntity.created(URI.create("/api/v1/users")).build();
    }
}
