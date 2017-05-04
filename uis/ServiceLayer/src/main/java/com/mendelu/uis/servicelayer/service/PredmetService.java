/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.servicelayer.service;

import com.mendelu.uis.daolayer.domain.Predmet;
import com.mendelu.uis.daolayer.domain.Student;
import java.util.List;

/**
 *
 * @author tjurnicek
 */
public interface PredmetService {
   
    
    String getNazev(Predmet predmet);
    
        List<Predmet> findAll();

    void delete(Predmet predmet);

    void create(Predmet predmet);

    void update(Predmet predmet, String newName);

     

    /**
    
     Predmet findById(int id);

    List<Predmet> findAll();

    //void delete(Be gym);
     * Gets all Badges belonging to Trainer
     *
     * @return List of all Students predmet.
     */
//    List<Predmet> getAllPredmetByStudent(Student student);
    
    
}
