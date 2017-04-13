/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.daolayer.dao;

import com.mendelu.uis.daolayer.domain.Predmet;
import com.mendelu.uis.daolayer.domain.Ucitel;
import com.mendelu.uis.daolayer.utils.DatabaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Jakub Jůza
 */
@ContextConfiguration(classes = DatabaseConfig.class)
@TestExecutionListeners(TransactionalTestExecutionListener.class)
@Transactional
public class PredmetDaoTest extends AbstractTestNGSpringContextTests{
    
    @Autowired
    private PredmetDao predmetDao;
    
    public PredmetDaoTest() {
    }

    /**
     * Test of save method, of class PredmetDao.
     */
    @Test
    public void testSave() {
        Ucitel u = new Ucitel("Jan Novak", "Ing.", "UI", "jan.novak@mendelu.cz");
        Predmet p = new Predmet("AR", "Artritis", 4, u);
                
        predmetDao.save(p);
        
        int id = p.getId();
        Predmet ret = predmetDao.findById(id);
        assertEquals(p, ret);
    }

    /**
     * Test of delete method, of class PredmetDao.
     */
    @Test
    public void testDelete() {
        Ucitel u = new Ucitel("Jan Novak", "Ing.", "UI", "jan.novak@mendelu.cz");
        Predmet p = new Predmet("AR", "Artritis", 4, u);
                
        predmetDao.save(p);
        predmetDao.delete(p);
        
        assertEquals(0, predmetDao.findAll().size());
    }

    /**
     * Test of findAll method, of class PredmetDao.
     */
    @Test
    public void testFindAll() {
        Ucitel u = new Ucitel("Jan Novak", "Ing.", "UI", "jan.novak@mendelu.cz");
        Predmet p = new Predmet("AR", "Artritis", 4, u);
                
        predmetDao.save(p);        
        
        assertEquals(1, predmetDao.findAll().size());
    }
}
