package com.mendelu.uis.daolayer.dao;

import com.mendelu.uis.daolayer.domain.Prednaska;

import java.util.List;

/**
 * Data Access Object providing access to database operations for Prednaska entity
 *
 * @author Roman Pechal
 */
public interface PrednaskaDao {

    /**
     * Finds and returns Prednaska by given ID (primary key)
     */
    public Prednaska findById(int id);

    /**
     * Saves Prednaska entity to database, can either update existing Prednaska or save new one
     */
    public void save(Prednaska prednaska);

    /**
     * Deletes given Prednaska entity from database
     */
    public void delete(Prednaska prednaska);

    /**
     * Returns all Prednaska entities from database
     */
    public List<Prednaska> findAll();

}
