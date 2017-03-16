package com.mendelu.uis.daolayer.dao;

import com.mendelu.uis.daolayer.domain.Predmet;

import java.util.List;

/**
 * Data Access Object providing access to database operations for Predmet entity
 *
 * @author Roman Pechal
 */
public interface PredmetDao {

    /**
     * Finds and returns Predmet by given ID (primary key)
     */
    public Predmet findById(int id);

    /**
     * Saves Predmet entity to database, can either update existing Predmet or save new one
     */
    public void save(Predmet predmet);

    /**
     * Deletes given Predmet entity from database
     */
    public void delete(Predmet predmet);

    /**
     * Returns all Predmet entities from database
     */
    public List<Predmet> findAll();

}
