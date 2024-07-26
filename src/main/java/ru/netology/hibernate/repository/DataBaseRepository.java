package ru.netology.hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entities.Persons;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DataBaseRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public DataBaseRepository() {}

    public List<Persons> getPersonsByCity(String city) {
        return entityManager.createQuery("from Persons where cityOfLiving like :city", Persons.class)
                .setParameter("city", city).getResultList();
    }
}
