package com.example.bikeservice.infrastructure;

import com.example.bikeservice.domain.model.BikeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BikeJpaRepository extends JpaRepository<BikeEntity, Long> {

    Optional<BikeEntity> findByUserId(String userId);
}
