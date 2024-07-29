package ru.netology.hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.entities.Persons;
import ru.netology.hibernate.repository.DataBaseRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class PersonsController {

    private final DataBaseRepository dataBaseRepository;

    public PersonsController(DataBaseRepository dataBaseRepository) {
        this.dataBaseRepository = dataBaseRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> personsByCity(@RequestParam("city") String city) {
        return dataBaseRepository.findByCityOfLiving(city);
    }

    @GetMapping("/persons/by-age")
    public List<Persons> personsByAge(@RequestParam("age") Integer age) {
        return dataBaseRepository.findByPersonIdAgeLessThanOrderByPersonIdAgeAsc(age);
    }

    @GetMapping("/persons/by-name-surname")
    public Optional<Persons> personsByNameSurname(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        return dataBaseRepository.findByPersonIdNameAndPersonIdSurname(name, surname);
    }
}
