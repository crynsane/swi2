package com.mendelu.uis.daolayer.dao;

import com.mendelu.uis.daolayer.domain.Ucitel;

import java.util.List;

/**
 * Data Access Object providing access to database operations for Ucitel entity
 *
 * @author Roman Pechal
 */
public interface UcitelDao {

    /**
     * Finds and returns Ucitel by given ID (primary key)
     */
    public Ucitel findById(int id);

    /**
     * Saves Ucitel entity to database, can either update existing Ucitel or save new one
     */
    public void save(Ucitel ucitel);

    /**
     * Deletes given Ucitel entity from database
     */
    public void delete(Ucitel ucitel);

    /**
     * Returns all Ucitel entities from database
     */
    public List<Ucitel> findAll();

}
