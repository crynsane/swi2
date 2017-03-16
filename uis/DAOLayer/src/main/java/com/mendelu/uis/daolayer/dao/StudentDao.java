package com.mendelu.uis.daolayer.dao;

import com.mendelu.uis.daolayer.domain.Student;

import java.util.List;

/**
 * Data Access Object providing access to database operations for Student entity
 *
 * @author Roman Pechal
 */
public interface StudentDao {

    /**
     * Finds and returns Student by given ID (primary key)
     */
    public Student findById(int id);

    /**
     * Saves Student entity to database, can either update existing Student or save new one
     */
    public void save(Student student);

    /**
     * Deletes given Student entity from database
     */
    public void delete(Student student);

    /**
     * Returns all Student entities from database
     */
    public List<Student> findAll();

}
