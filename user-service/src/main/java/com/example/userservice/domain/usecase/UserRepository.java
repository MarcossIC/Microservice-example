package com.example.userservice.domain.usecase;

import com.example.userservice.domain.model.User;
import com.example.userservice.domain.model.UserSaveDTO;

import java.util.Set;

public interface UserRepository {

    Set<User> getAllUsers();

    User getUserById(final Long ID);

    User saveUser(final UserSaveDTO userSaveDTO);
}
