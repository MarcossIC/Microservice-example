package com.example.userservice.application.usecase;

import com.example.userservice.domain.usecase.UserRepository;
import com.example.userservice.domain.model.User;
import com.example.userservice.domain.usecase.RetrieveUserByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public final class RetrieveUserByIdServiceImpl implements RetrieveUserByIdService {
    private final UserRepository repository;

    @Override
    public User getUserById(final Long ID) {
        return repository.getUserById(ID);
    }
}
