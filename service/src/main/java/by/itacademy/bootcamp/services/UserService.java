package by.itacademy.bootcamp.services;

import by.itacademy.bootcamp.api.IUserStorage;
import by.itacademy.bootcamp.buider.UserBuilder;
import by.itacademy.bootcamp.dto.InputDto;
import by.itacademy.bootcamp.entity.User;
import by.itacademy.bootcamp.services.api.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

    private final IUserStorage userStorage;

    @Override
    public User create(InputDto iDto) {
        userStorage.save(UserBuilder
                .create()
                .setId(UUID.randomUUID())
                .setName(iDto.getName())
                .setSurname(iDto.getSurname())
                .setPatronymic(iDto.getPatronymic())
                .setEmail(iDto.getEmail())
                .setRole(iDto.getRole())
                .build());
        return null;
    }

    @Override
    public User read() {
        userStorage.findAll();
        return null;
    }
}

