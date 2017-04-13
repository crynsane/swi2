/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.daolayer.dao;

import com.mendelu.uis.daolayer.domain.Cviceni;
import com.mendelu.uis.daolayer.domain.Predmet;
import com.mendelu.uis.daolayer.domain.Student;
import com.mendelu.uis.daolayer.domain.Ucitel;
import com.mendelu.uis.daolayer.utils.DatabaseConfig;
import java.sql.Timestamp;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jakub Jůza
 */
@ContextConfiguration(classes = DatabaseConfig.class)
@TestExecutionListeners(TransactionalTestExecutionListener.class)
@Transactional
public class CviceniDaoTest extends AbstractTestNGSpringContextTests {
    
    @Autowired
    private CviceniDao cviceniDao;

    /**
     * Test of save method, of class CviceniDao.
     */
    @Test
    public void testSave() {        
        Ucitel u = new Ucitel("Jan Novak", "Ing.", "UI", "jan.novak@mendelu.cz");
        Predmet p = new Predmet("AR", "Artritis", 4, u);
        Student s1 = new Student("Jiri Par", "", 3, "xpar@mendelu.cz", 5);
        s1.addPredmet(p);
       
        Timestamp zac = new Timestamp(1300), kon = new Timestamp(1440);
        Cviceni cviceni = new Cviceni("Q12", 20, u, zac, kon, p);
        cviceni.addStudent(s1);
        
        cviceniDao.save(cviceni);
        
        int id = cviceni.getId();
        Cviceni ret = cviceniDao.findById(id);
        assertEquals(cviceni, ret);
    }

    /**
     * Test of delete method, of class CviceniDao.
     */
    @Test
    public void testDelete() {
        Ucitel u = new Ucitel("Jan Novak", "Ing.", "UI", "jan.novak@mendelu.cz");
        Predmet p = new Predmet("AR", "Artritis", 4, u);
        Student s1 = new Student("Jiri Par", "", 3, "xpar@mendelu.cz", 5);
        s1.addPredmet(p);
      
        Timestamp zac = new Timestamp(1300), kon = new Timestamp(1440);
        Cviceni cviceni = new Cviceni("Q12", 20, u, zac, kon, p);
        cviceni.addStudent(s1);
        
        cviceniDao.save(cviceni);
        cviceniDao.delete(cviceni);
        
        assertEquals(0, cviceniDao.findAll().size());
    }

    /**
     * Test of findAll method, of class CviceniDao.
     */
    @Test
    public void testFindAll() {
        Ucitel u = new Ucitel("Jan Novak", "Ing.", "UI", "jan.novak@mendelu.cz");
        Predmet p = new Predmet("AR", "Artritis", 4, u);
        Student s1 = new Student("Jiri Par", "", 3, "xpar@mendelu.cz", 5);
        s1.addPredmet(p);
       
        Timestamp zac = new Timestamp(1300), kon = new Timestamp(1440);
        Cviceni cviceni = new Cviceni("Q12", 20, u, zac, kon, p);
        cviceni.addStudent(s1);
        
        cviceniDao.save(cviceni);
        
        assertEquals(1, cviceniDao.findAll().size());
    } 
}
