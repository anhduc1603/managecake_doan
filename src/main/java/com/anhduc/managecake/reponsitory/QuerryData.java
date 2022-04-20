package com.anhduc.managecake.reponsitory;

import com.anhduc.managecake.model.Category;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class QuerryData {
    @PersistenceContext
    private EntityManager entityManager;


    @Transactional
    public void insertWithQuery(Category person) {
        entityManager.createNativeQuery("INSERT INTO category(name) VALUES (?)")
                .setParameter(1, person.getName()).executeUpdate();
    }
}
