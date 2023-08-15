package com.example.userservice.application.usecase;

import com.example.userservice.domain.usecase.UserRepository;
import com.example.userservice.domain.model.UserSaveDTO;
import com.example.userservice.domain.usecase.SaveUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public final class SaveUserServiceImpl implements SaveUserService {
    private final UserRepository repository;
    @Override
    public void saveUser(final UserSaveDTO userSaveDTO) {
        repository.saveUser(userSaveDTO);
    }
}
