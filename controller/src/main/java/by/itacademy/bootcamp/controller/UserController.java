package by.itacademy.bootcamp.controller;

import by.itacademy.bootcamp.dto.InputDto;
import by.itacademy.bootcamp.services.api.IService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
@AllArgsConstructor
public class UserController {

    private final String CREATED = "User was created successfully";
    private final IService service;

    @PostMapping
    protected ResponseEntity<String> addUser(@RequestBody InputDto inputDto){
        service.create(inputDto);
        return new ResponseEntity<>(CREATED,HttpStatus.CREATED);
    }

    @GetMapping
    protected ResponseEntity<String> getUsers(){
        service.read();
          return null;
    }
}
