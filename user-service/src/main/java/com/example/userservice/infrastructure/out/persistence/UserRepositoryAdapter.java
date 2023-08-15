package com.example.userservice.infrastructure.out.persistence;

import com.example.userservice.domain.usecase.UserRepository;
import com.example.userservice.domain.model.User;
import com.example.userservice.domain.model.UserEntity;
import com.example.userservice.domain.model.UserSaveDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepository {
    private final UserJpaRepository jpaRepository;

    private static final Function<UserEntity, User> userMapper = (entity)-> new User(entity.getId(), entity.getName(), entity.getEmail());
    private static final Function<UserSaveDTO, UserEntity> mapperSaveUser = (dto)-> new UserEntity(dto.name(), dto.email(), dto.password());

    @Override
    public Set<User> getAllUsers() {
        return jpaRepository
                .findAll().stream()
                .map(userMapper)
                .collect(Collectors.toSet());
    }

    @Override
    public User getUserById(final Long ID) {
        return jpaRepository
                .findById(ID).map(userMapper)
                .orElseThrow(()-> new RuntimeException("This UserID is not registered"));
    }

    @Override
    public void saveUser(UserSaveDTO userSaveDTO) {
        jpaRepository.save( mapperSaveUser.apply(userSaveDTO) );
    }


}
