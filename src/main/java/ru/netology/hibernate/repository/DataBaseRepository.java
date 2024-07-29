package ru.netology.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entities.Persons;

import java.util.List;
import java.util.Optional;

@Repository
public interface DataBaseRepository extends JpaRepository<Persons, Integer> {

    List<Persons> findByCityOfLiving(String city);

    List<Persons> findByPersonIdAgeLessThanOrderByPersonIdAgeAsc(Integer age);

    Optional<Persons> findByPersonIdNameAndPersonIdSurname(String name, String surname);
}
