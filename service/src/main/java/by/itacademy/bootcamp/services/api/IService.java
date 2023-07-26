package by.itacademy.bootcamp.services.api;

import by.itacademy.bootcamp.dto.api.IDto;
import by.itacademy.bootcamp.entity.User;

public interface IService<TYPE,IDTO> {

    TYPE create(IDTO idto);


    TYPE read();

}
