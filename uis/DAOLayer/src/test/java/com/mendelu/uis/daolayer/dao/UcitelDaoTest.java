/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.daolayer.dao;

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
public class UcitelDaoTest extends AbstractTestNGSpringContextTests{
    
    @Autowired
    private UcitelDao ucitelDao;

    /**
     * Test of save method, of class UcitelDao.
     */
    @Test
    public void testSave() {
        Ucitel u = new Ucitel("Jan Novak", "Ing.", "UI", "jan.novak@mendelu.cz");
        ucitelDao.save(u);
        
        int id = u.getId();
        Ucitel ret = ucitelDao.findById(id);
        assertEquals(u, ret);
    }

    /**
     * Test of delete method, of class UcitelDao.
     */
    @Test
    public void testDelete() {
        Ucitel u = new Ucitel("Jan Novak", "Ing.", "UI", "jan.novak@mendelu.cz");
        ucitelDao.save(u);
        ucitelDao.delete(u);
        assertEquals(0, ucitelDao.findAll().size());
    }

    /**
     * Test of findAll method, of class UcitelDao.
     */
    @Test
    public void testFindAll() {
        Ucitel u = new Ucitel("Jan Novak", "Ing.", "UI", "jan.novak@mendelu.cz");
        ucitelDao.save(u);
        assertEquals(1, ucitelDao.findAll().size());
    }
}
