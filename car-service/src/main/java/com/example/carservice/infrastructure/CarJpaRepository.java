package com.example.carservice.infrastructure;

import com.example.carservice.domain.model.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarJpaRepository extends JpaRepository<CarEntity, Long> {

    Optional<CarEntity> findByUserId(String userId);
}
