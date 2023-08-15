package com.example.userservice.application.usecase;

import com.example.userservice.domain.usecase.UserRepository;
import com.example.userservice.domain.model.User;
import com.example.userservice.domain.usecase.ListAllUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public final class ListAllUserServiceImpl implements ListAllUserService {
    private final UserRepository repository;

    public Set<User> getAllUser(){


        return repository.getAllUsers();
    }

}
