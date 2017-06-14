/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.servicelayer.facade;

import com.mendelu.uis.daolayer.domain.Predmet;
import com.mendelu.uis.servicelayer.service.BeanMappingService;
import com.mendelu.uis.servicelayer.service.PredmetService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import javax.inject.Inject;
/**
 *
 * @author pechal
 */
@Service
@Transactional
public class PredmetFacadeImpl implements PredmetFacade {

    @Inject
    private PredmetService predmetService;

    @Inject
    private BeanMappingService beanMappingService;

    @Override
    public List<Predmet> getAllPredmet() {
        //System.console().writer().write("Test");
        //List<Predmet> a = predmetService.findAll();
        //return beanMappingService.mapTo(a, Predmet.class);
        return beanMappingService.mapTo(predmetService.findAll(), Predmet.class);
    }
    
}
