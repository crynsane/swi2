/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.servicelayer.service;

import com.mendelu.uis.daolayer.domain.Ucitel;
import java.util.List;

/**
 *
 * @author Martin
 */
public interface UcitelService {
   
    
    String getNazev(Ucitel ucitel);
    
        List<Ucitel> findAll();

    void delete(Ucitel ucitel);

    void create(Ucitel ucitel);

    void update(Ucitel ucitel, String newName);
}