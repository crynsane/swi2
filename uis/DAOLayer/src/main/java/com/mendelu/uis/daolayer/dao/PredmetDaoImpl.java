package com.mendelu.uis.daolayer.dao;

import com.mendelu.uis.daolayer.domain.Predmet;
import com.mendelu.uis.daolayer.utils.DaoLayerException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Roman Pechal
 */
@Repository
public class PredmetDaoImpl implements PredmetDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Predmet findById(int id) {
        try {
            return entityManager.find(Predmet.class, id);
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public void save(Predmet badge) {
        if (findById(badge.getId()) != null) {
            try {
                entityManager.merge(badge);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        } else {
            try {
                entityManager.persist(badge);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        }
    }

    @Override
    public void delete(Predmet predmet) {
        try {
            entityManager.remove(findById(predmet.getId()));
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public List<Predmet> findAll() {
        try {
            return entityManager.createQuery("select b from Predmet b", Predmet.class).getResultList();
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

}

