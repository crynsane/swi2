/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.servicelayer.facade;

import com.mendelu.uis.daolayer.domain.Predmet;
import java.util.List;

/**
 *
 * @author pechal
 */
public interface PredmetFacade {
    List<Predmet> getAllPredmet();
}
