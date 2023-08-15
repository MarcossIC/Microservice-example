package com.example.userservice.infrastructure.out.persistence;

import com.example.userservice.domain.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
}
