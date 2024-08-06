//package ru.netology.hibernate.controller;
//
//import jakarta.annotation.security.RolesAllowed;
//import org.springframework.security.access.annotation.Secured;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import ru.netology.hibernate.entities.Persons;
//import ru.netology.hibernate.repository.DataBaseCrudRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/")
//public class PersonsController {
//
//    private final DataBaseCrudRepository dataBaseRepository;
//
//    public PersonsController(DataBaseCrudRepository dataBaseRepository) {
//        this.dataBaseRepository = dataBaseRepository;
//    }
//
//    @GetMapping("/persons/by-city")
//    public List<Persons> personsByCity(@RequestParam("city") String city) {
//        return dataBaseRepository.findByCity(city);
//    }
//
//    @GetMapping("/persons/by-age")
//    public List<Persons> personsByAge(@RequestParam("age") Integer age) {
//        return dataBaseRepository.findByPersonAge(age);
//    }
//
//    @GetMapping("/persons/by-name-surname")
//    public Optional<Persons> personsByNameSurname(@RequestParam("name") String name, @RequestParam("surname") String surname) {
//        return dataBaseRepository.findByPersonNameAndSurname(name, surname);
//    }
//}
