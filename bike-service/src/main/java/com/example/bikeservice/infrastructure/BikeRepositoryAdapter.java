package com.example.bikeservice.infrastructure;

import com.example.bikeservice.domain.BikeRepository;
import com.example.bikeservice.domain.model.Bike;
import com.example.bikeservice.domain.model.BikeEntity;
import com.example.bikeservice.domain.model.BikeSaveDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class BikeRepositoryAdapter implements BikeRepository {
    private final BikeJpaRepository jpaRepository;

    private static final Function<BikeEntity, Bike> entityToModel = entity-> new Bike(entity.getId(), entity.getBrand(), entity.getModel(), entity.getUserId());
    private static final Function<BikeSaveDTO, BikeEntity> dtoToEntity = dto-> new BikeEntity(dto.brand(), dto.model(), dto.userId());

    @Override
    public Set<Bike> getAllBikes() {
        return jpaRepository
                .findAll().stream()
                .map(entityToModel)
                .collect(Collectors.toSet());
    }

    @Override
    public Bike getBikeById(final Long ID) {
        return jpaRepository
                .findById(ID).map(entityToModel)
                .orElseThrow(()-> new RuntimeException("This UserID is not registered"));
    }

    @Override
    public Bike getBikeByUserId(String userId) {
        return jpaRepository.findByUserId(userId)
                .map(entityToModel)
                .orElseThrow(()-> new RuntimeException("This UserID is not registered"));
    }

    @Override
    public void saveBike(final BikeSaveDTO bikeSaveDTO) {
        jpaRepository.save( dtoToEntity.apply(bikeSaveDTO) );
    }


}
