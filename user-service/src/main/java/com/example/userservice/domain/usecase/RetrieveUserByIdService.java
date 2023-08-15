package com.example.userservice.domain.usecase;

import com.example.userservice.domain.model.User;

public interface RetrieveUserByIdService {

    User getUserById(final Long ID);
}
