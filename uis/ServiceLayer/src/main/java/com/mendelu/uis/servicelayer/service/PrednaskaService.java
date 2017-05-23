/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.servicelayer.service;

import com.mendelu.uis.daolayer.domain.Prednaska;
import java.util.List;

/**
 *
 * @author Martin
 */
public interface PrednaskaService {

    /**
     * Finds and returns Prednaska by given ID (primary key)
     */
    Prednaska findById(int id);

    /**
     * Saves Prednaska entity to database, can either update existing Prednaska or save new one
     */
    void save(Prednaska prednaska);

    /**
     * Deletes given Prednaska entity from database
     */
    void delete(Prednaska prednaska);

    /**
     * Returns all Prednaska entities from database
     */
    List<Prednaska> findAll();

}
