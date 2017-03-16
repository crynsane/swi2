package com.mendelu.uis.daolayer.dao;

import com.mendelu.uis.daolayer.domain.Student;
import com.mendelu.uis.daolayer.utils.DaoLayerException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Roman Pechal
 */
@Repository
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Student findById(int id) {
        try {
            return entityManager.find(Student.class, id);
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public void save(Student student) {
        if (findById(student.getId()) != null) {
            try {
                entityManager.merge(student);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        } else {
            try {
                entityManager.persist(student);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        }
    }

    @Override
    public void delete(Student student) {
        try {
            entityManager.remove(findById(student.getId()));
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public List<Student> findAll() {
        try {
            return entityManager.createQuery("select b from Student b", Student.class).getResultList();
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

}

