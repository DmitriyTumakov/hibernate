package ru.netology.hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entities.PersonId;
import ru.netology.hibernate.entities.Persons;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DataBaseRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public DataBaseRepository() {}

    public List<Persons> getPersonsByCity(String city) {
        List<Persons> result = new ArrayList<Persons>();
        List<Persons> personsList = entityManager.createNativeQuery("select * from persons_schema.persons where city_of_living = '" + city + "'", Persons.class)
                .getResultList();

        for (Persons persons : personsList) {
            if (persons.getCity_of_living().equals(city)) {
                result.add(persons);
            }
        }

        return result;
    }
}
