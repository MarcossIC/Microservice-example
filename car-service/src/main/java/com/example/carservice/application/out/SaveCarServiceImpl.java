package com.example.carservice.application.out;

import com.example.carservice.domain.CarRepository;
import com.example.carservice.domain.model.CarSaveDTO;
import com.example.carservice.domain.service.SaveCarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public final class SaveCarServiceImpl implements SaveCarService {
    private final CarRepository repository;
    @Override
    public void saveCar(final CarSaveDTO carSaveDTO) {
        repository.saveCar(carSaveDTO);
    }
}
