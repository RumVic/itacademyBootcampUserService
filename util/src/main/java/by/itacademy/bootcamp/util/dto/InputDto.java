package by.itacademy.bootcamp.dto;

import by.itacademy.bootcamp.dto.api.IDto;

public class InputDto implements IDto {

    private String name;
    private String surname;
    private String patronymic;
    private String email;
    private String role;

    public InputDto(String name, String surname, String patronymic, String email, String role) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.email = email;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }
}
