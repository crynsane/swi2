/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.servicelayer.service;

import com.mendelu.uis.daolayer.domain.Cviceni;
import java.util.List;

/**
 *
 * @author Martin
 */
public interface CviceniService {
   
    
    String getNazev(Cviceni cviceni);
    
        List<Cviceni> findAll();

    void delete(Cviceni cviceni);

    void create(Cviceni cviceni);

    void update(Cviceni cviceni, String newName);
    
}