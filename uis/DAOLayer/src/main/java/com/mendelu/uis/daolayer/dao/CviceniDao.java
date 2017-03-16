package com.mendelu.uis.daolayer.dao;

import com.mendelu.uis.daolayer.domain.Cviceni;

import java.util.List;

/**
 * Data Access Object providing access to database operations for Cviceni entity
 *
 * @author Roman Pechal
 */
public interface CviceniDao {

    /**
     * Finds and returns Cviceni by given ID (primary key)
     */
    public Cviceni findById(int id);

    /**
     * Saves Cviceni entity to database, can either update existing Cviceni or save new one
     */
    public void save(Cviceni cviceni);

    /**
     * Deletes given Cviceni entity from database
     */
    public void delete(Cviceni cviceni);

    /**
     * Returns all Cviceni entities from database
     */
    public List<Cviceni> findAll();

}
