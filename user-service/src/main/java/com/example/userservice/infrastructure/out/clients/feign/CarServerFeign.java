package com.example.userservice.infrastructure.out.clients.feign;

import com.example.userservice.domain.model.CarSaveDTO;
import com.example.userservice.domain.service.CarServerClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@Primary
@RequiredArgsConstructor
public class CarServerFeign implements CarServerClient {
    private final CarFeignClient client;

    @Override
    public void saveCar(CarSaveDTO carSaveDTO) {
        log.info("ENTRE AL METODO");
        client.saveCar(carSaveDTO);
    }
}
