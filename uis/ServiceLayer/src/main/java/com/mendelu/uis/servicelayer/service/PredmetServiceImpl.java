/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.servicelayer.service;

import com.mendelu.uis.daolayer.domain.Predmet;
import javax.inject.Inject;

/**
 *
 * @author tjurnicek
 */
public class PredmetServiceImpl implements PredmetService {
    
    
    @Inject
    private Predmet predmetDao;

    @Override
    public String getNazev(Predmet predmet) {
        return predmet.getNazev();
    }

 


    
    
}
