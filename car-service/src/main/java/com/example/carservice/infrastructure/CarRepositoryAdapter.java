package com.example.carservice.infrastructure;

import com.example.carservice.domain.CarRepository;
import com.example.carservice.domain.model.Car;
import com.example.carservice.domain.model.CarEntity;
import com.example.carservice.domain.model.CarSaveDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class CarRepositoryAdapter implements CarRepository {
    private final CarJpaRepository jpaRepository;

    private static final Function<CarEntity, Car> entityToModel = entity-> new Car(entity.getId(), entity.getBrand(), entity.getModel(), entity.getUserId());
    private static final Function<CarSaveDTO, CarEntity> dtoToEntity = dto-> new CarEntity(dto.brand(), dto.model(), dto.userId());

    @Override
    public Set<Car> getAllCars() {
        return jpaRepository
                .findAll().stream()
                .map(entityToModel)
                .collect(Collectors.toSet());
    }

    @Override
    public Car getCarById(final Long ID) {
        return jpaRepository
                .findById(ID).map(entityToModel)
                .orElseThrow(()-> new RuntimeException("This UserID is not registered"));
    }

    @Override
    public Car getCarByUserId(String userId) {
        return jpaRepository.findByUserId(userId)
                .map(entityToModel)
                .orElseThrow(()-> new RuntimeException("This UserID is not registered"));
    }

    @Override
    public void saveCar(final CarSaveDTO userSaveDTO) {
        jpaRepository.save( dtoToEntity.apply(userSaveDTO) );
    }


}
