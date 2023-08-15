package com.example.userservice.application.usecase;

import com.example.userservice.domain.model.CarSaveDTO;
import com.example.userservice.domain.service.CarServerClient;
import com.example.userservice.domain.usecase.UserRepository;
import com.example.userservice.domain.model.UserSaveDTO;
import com.example.userservice.domain.usecase.SaveUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public final class SaveUserServiceImpl implements SaveUserService {
    private final UserRepository repository;
    private final CarServerClient client;
    @Override
    public void saveUser(final UserSaveDTO userSaveDTO) {
        var user =repository.saveUser(userSaveDTO);
        log.info(" CREE EL USER ");

        client.saveCar(new CarSaveDTO("fiat", "fiat 500", user.id().toString()));

        log.info(" PASE EL SAVE CAR ");
    }
}
