/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.servicelayer.service;

import com.mendelu.uis.daolayer.dao.CviceniDao;
import com.mendelu.uis.daolayer.domain.Cviceni;
import javax.inject.Inject;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Martin
 */
@Service
public class CviceniServiceImpl implements CviceniService {
    
    
    @Inject
    private CviceniDao cviceniDao;

    @Override
    public String getNazev(Cviceni cviceni) {
        return cviceni.getNazev();
    }
    
   
    @Override
    public void delete(Cviceni cviceni) {
        cviceniDao.delete(cviceni);
    }

    @Override
    public void create(Cviceni cviceni) {
        cviceniDao.save(cviceni);
    }

    @Override
    public void update(Cviceni cviceni, String newName) {
        cviceni.setName(newName);
        cviceniDao.save(cviceni);
    }

    @Override
    public List<Cviceni> findAll() {
        return cviceniDao.findAll();}
   
}
    

