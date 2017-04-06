/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.daolayer.dao;

import com.mendelu.uis.daolayer.domain.Predmet;
import com.mendelu.uis.daolayer.domain.Prednaska;
import com.mendelu.uis.daolayer.domain.Ucitel;
import com.mendelu.uis.daolayer.utils.DatabaseConfig;
import java.sql.Timestamp;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jakub Jůza
 */
@ContextConfiguration(classes = DatabaseConfig.class)
@TestExecutionListeners(TransactionalTestExecutionListener.class)
@Transactional
public class PrednaskaDaoTest {
    
    @Autowired
    private PrednaskaDao prednaskaDao;

    /**
     * Test of save method, of class PrednaskaDao.
     */
    @Test
    public void testSave() {
        Ucitel u = new Ucitel("Jan Novak", "Ing.", "UI", "jan.novak@mendelu.cz");
        Predmet p = new Predmet("AR", "Artritis", 4, u);
        Timestamp zac = new Timestamp(1300), kon = new Timestamp(1440);
        Prednaska pred = new Prednaska("Q04", u, p, zac, kon);
        
        prednaskaDao.save(pred);
        
        int id = pred.getId();
        Prednaska ret = prednaskaDao.findById(id);
        assertEquals(pred, ret);
    }

    /**
     * Test of delete method, of class PrednaskaDao.
     */
    @Test
    public void testDelete() {
        Ucitel u = new Ucitel("Jan Novak", "Ing.", "UI", "jan.novak@mendelu.cz");
        Predmet p = new Predmet("AR", "Artritis", 4, u);
        Timestamp zac = new Timestamp(1300), kon = new Timestamp(1440);
        Prednaska pred = new Prednaska("Q04", u, p, zac, kon);
        
        prednaskaDao.save(pred);
        prednaskaDao.delete(pred);
        assertEquals(0, prednaskaDao.findAll().size());
    }

    /**
     * Test of findAll method, of class PrednaskaDao.
     */
    @Test
    public void testFindAll() {
        Ucitel u = new Ucitel("Jan Novak", "Ing.", "UI", "jan.novak@mendelu.cz");
        Predmet p = new Predmet("AR", "Artritis", 4, u);
        Timestamp zac = new Timestamp(1300), kon = new Timestamp(1440);
        Prednaska pred = new Prednaska("Q04", u, p, zac, kon);
        
        prednaskaDao.save(pred);

        assertEquals(1, prednaskaDao.findAll().size());
    }
}
