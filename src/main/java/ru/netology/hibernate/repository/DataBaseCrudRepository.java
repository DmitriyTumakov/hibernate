package ru.netology.hibernate.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entities.Persons;

import java.util.List;
import java.util.Optional;

@Repository
public interface DataBaseCrudRepository extends CrudRepository<Persons, Integer> {

    @Query("select p from Persons p where p.cityOfLiving = :city")
    List<Persons> findByCity(@Param("city") String city);

    @Query("select p from Persons p where p.personId.age < :age order by p.personId.age asc")
    List<Persons> findByPersonAge(@Param("age") Integer age);

    @Query("select p from Persons p where p.personId.name = :name and p.personId.surname = :surname")
    Optional<Persons> findByPersonNameAndSurname(@Param("name") String name, @Param("surname") String surname);
}
