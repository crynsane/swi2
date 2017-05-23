/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.servicelayer.service;

import com.mendelu.uis.daolayer.dao.PredmetDao;
import com.mendelu.uis.daolayer.domain.Predmet;
import javax.inject.Inject;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author xnemet
 */
@Service
public class PredmetServiceImpl implements PredmetService {
    
    
    @Inject
    private PredmetDao predmetDao;

    @Override
    public String getNazev(Predmet predmet) {
        return predmet.getNazev();
    }
    
   
    @Override
    public void delete(Predmet predmet) {
        predmetDao.delete(predmet);
    }

    @Override
    public void create(Predmet predmet) {
        predmetDao.save(predmet);
    }

    @Override
    public void update(Predmet predmet, String newName) {
        predmet.setName(newName);
        predmetDao.save(predmet);
    }

    @Override
    public List<Predmet> findAll() {
        return predmetDao.findAll();}
   
}
