package com.mendelu.uis.daolayer.dao;

import com.mendelu.uis.daolayer.domain.Prednaska;
import com.mendelu.uis.daolayer.utils.DaoLayerException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Roman Pechal
 */
@Repository
public class PrednaskaDaoImpl implements PrednaskaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Prednaska findById(int id) {
        try {
            return entityManager.find(Prednaska.class, id);
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public void save(Prednaska prednaska) {
        if (findById(prednaska.getId()) != null) {
            try {
                entityManager.merge(prednaska);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        } else {
            try {
                entityManager.persist(prednaska);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        }
    }

    @Override
    public void delete(Prednaska prednaska) {
        try {
            entityManager.remove(findById(prednaska.getId()));
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public List<Prednaska> findAll() {
        try {
            return entityManager.createQuery("select b from Prednaska b", Prednaska.class).getResultList();
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

}

