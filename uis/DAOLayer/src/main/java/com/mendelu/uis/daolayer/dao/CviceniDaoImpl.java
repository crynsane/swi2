package com.mendelu.uis.daolayer.dao;

import com.mendelu.uis.daolayer.domain.Cviceni;
import com.mendelu.uis.daolayer.utils.DaoLayerException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Roman Pechal
 */
@Repository
public class CviceniDaoImpl implements CviceniDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Cviceni findById(int id) {
        try {
            return entityManager.find(Cviceni.class, id);
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public void save(Cviceni cviceni) {
        if (findById(cviceni.getId()) != null) {
            try {
                entityManager.merge(cviceni);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        } else {
            try {
                entityManager.persist(cviceni);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        }
    }

    @Override
    public void delete(Cviceni cviceni) {
        try {
            entityManager.remove(findById(cviceni.getId()));
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public List<Cviceni> findAll() {
        try {
            return entityManager.createQuery("select b from Cviceni b", Cviceni.class).getResultList();
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

}

