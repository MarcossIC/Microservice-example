package com.example.userservice.domain.usecase;

import com.example.userservice.domain.model.User;

import java.util.Set;

public interface ListAllUserService {
    Set<User> getAllUser();
}
