/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.servicelayer.service;

import com.mendelu.uis.daolayer.dao.UcitelDao;
import com.mendelu.uis.daolayer.domain.Ucitel;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

/**
 *
 * @author Martin
 */
@Service
public class UcitelServiceImpl implements UcitelService {
    
    
    @Inject
    private UcitelDao ucitelDao;

    @Override
    public String getNazev(Ucitel ucitel) {
        return ucitel.getNazev();
    }
    
   
    @Override
    public void delete(Ucitel ucitel) {
        ucitelDao.delete(ucitel);
    }

    @Override
    public void create(Ucitel ucitel) {
        ucitelDao.save(ucitel);
    }

    @Override
    public void update(Ucitel ucitel, String newName) {
        ucitel.setName(newName);
        ucitelDao.save(ucitel);
    }

    @Override
    public List<Ucitel> findAll() {
        return ucitelDao.findAll();}

}