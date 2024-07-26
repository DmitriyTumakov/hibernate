package ru.netology.hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.entities.Persons;
import ru.netology.hibernate.repository.DataBaseRepository;

import java.util.List;

@RestController
@RequestMapping("/")
public class PersonsController {

    private final DataBaseRepository dataBaseRepository;

    public PersonsController(DataBaseRepository dataBaseRepository) {
        this.dataBaseRepository = dataBaseRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> personsByCity(@RequestParam("city") String city) {
        return dataBaseRepository.getPersonsByCity(city);
    }
}
