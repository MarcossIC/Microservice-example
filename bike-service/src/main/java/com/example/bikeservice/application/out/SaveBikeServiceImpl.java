package com.example.bikeservice.application.out;

import com.example.bikeservice.domain.BikeRepository;
import com.example.bikeservice.domain.model.BikeSaveDTO;
import com.example.bikeservice.domain.service.SaveBikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public final class SaveBikeServiceImpl implements SaveBikeService {
    private final BikeRepository repository;
    @Override
    public void saveBike(final BikeSaveDTO bikeSaveDTO) {
        repository.saveBike(bikeSaveDTO);
    }
}
