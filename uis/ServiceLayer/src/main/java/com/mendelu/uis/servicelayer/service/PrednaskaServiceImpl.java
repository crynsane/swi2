/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.servicelayer.service;

import com.mendelu.uis.daolayer.dao.PrednaskaDao;
import com.mendelu.uis.daolayer.domain.Prednaska;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

/**
 *
 * @author Martin
 */
@Service
public class PrednaskaServiceImpl implements PrednaskaService {
    
    
    @Inject
    private PrednaskaDao prednaskaDao;

  
    
   
    @Override
    public void delete(Prednaska prednaska) {
        prednaskaDao.delete(prednaska);
    }
    
       

    @Override
    public List<Prednaska> findAll() {
        return prednaskaDao.findAll();}
    
    
    @Override
    public Prednaska findById(int id) {
        return prednaskaDao.findById(id);}

    @Override
    public void save(Prednaska prednaska) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
}
