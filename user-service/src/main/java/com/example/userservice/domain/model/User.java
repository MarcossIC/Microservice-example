package com.example.userservice.domain.model;

public record User(
        Long id,
        String name,
        String email
) { }
