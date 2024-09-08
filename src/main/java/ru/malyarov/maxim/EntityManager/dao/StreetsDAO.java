package ru.malyarov.maxim.EntityManager.dao;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.malyarov.maxim.EntityManager.model.Street;

import java.util.List;

@Component
@Transactional(readOnly = true)
public class StreetsDAO {

    private final EntityManager entityManager;

    @Autowired
    public StreetsDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public List<Street> getAll() {
        return entityManager.createQuery("select s from Street s", Street.class).getResultList();
    }

    @Transactional
    public void create(Street street) {
        entityManager.persist(street);
    }

    
    
}
