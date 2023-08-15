package com.example.userservice.domain.usecase;

import com.example.userservice.domain.model.UserSaveDTO;

public interface SaveUserService {

    void saveUser(UserSaveDTO userSaveDTO);
}
