package com.mendelu.uis.daolayer.dao;

import com.mendelu.uis.daolayer.domain.Ucitel;
import com.mendelu.uis.daolayer.utils.DaoLayerException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Roman Pechal
 */
@Repository
public class UcitelDaoImpl implements UcitelDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Ucitel findById(int id) {
        try {
            return entityManager.find(Ucitel.class, id);
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public void save(Ucitel ucitel) {
        if (findById(ucitel.getId()) != null) {
            try {
                entityManager.merge(ucitel);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        } else {
            try {
                entityManager.persist(ucitel);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        }
    }

    @Override
    public void delete(Ucitel ucitel) {
        try {
            entityManager.remove(findById(ucitel.getId()));
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public List<Ucitel> findAll() {
        try {
            return entityManager.createQuery("select b from Ucitel b", Ucitel.class).getResultList();
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

}

