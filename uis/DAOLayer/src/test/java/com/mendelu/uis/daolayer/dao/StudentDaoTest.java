/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.daolayer.dao;

import com.mendelu.uis.daolayer.domain.Predmet;
import com.mendelu.uis.daolayer.domain.Student;
import com.mendelu.uis.daolayer.domain.Ucitel;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jakub Jůza
 */
@TestExecutionListeners(TransactionalTestExecutionListener.class)
@Transactional
public class StudentDaoTest {
    @Autowired
    private StudentDao studentDao;

    /**
     * Test of save method, of class StudentDao.
     */
    @Test
    public void testSave() {
        Ucitel u = new Ucitel("Jan Novak", "Ing.", "UI", "jan.novak@mendelu.cz");
        Predmet p = new Predmet("AR", "Artritis", 4, u);
        ArrayList<Predmet> ps = new ArrayList<>();
        ps.add(p);
        Student s1 = new Student("Jiri Par", "", 3, "xpar@mendelu.cz", ps, 5);
        
        studentDao.save(s1);
        
        int id = s1.getId();
        Student ret = studentDao.findById(id);
        assertEquals(s1, ret);
    }

    /**
     * Test of delete method, of class StudentDao.
     */
    @Test
    public void testDelete() {
        Ucitel u = new Ucitel("Jan Novak", "Ing.", "UI", "jan.novak@mendelu.cz");
        Predmet p = new Predmet("AR", "Artritis", 4, u);
        ArrayList<Predmet> ps = new ArrayList<>();
        ps.add(p);
        Student s1 = new Student("Jiri Par", "", 3, "xpar@mendelu.cz", ps, 5);
        
        studentDao.save(s1);
        studentDao.delete(s1);
        assertEquals(0, studentDao.findAll().size());
    }

    /**
     * Test of findAll method, of class StudentDao.
     */
    @Test
    public void testFindAll() {
        Ucitel u = new Ucitel("Jan Novak", "Ing.", "UI", "jan.novak@mendelu.cz");
        Predmet p = new Predmet("AR", "Artritis", 4, u);
        ArrayList<Predmet> ps = new ArrayList<>();
        ps.add(p);
        Student s1 = new Student("Jiri Par", "", 3, "xpar@mendelu.cz", ps, 5);
        
        studentDao.save(s1);
        assertEquals(1, studentDao.findAll().size());
    }
}
