/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.servicelayer.service;

import com.mendelu.uis.daolayer.dao.StudentDao;
import com.mendelu.uis.daolayer.domain.Student;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

/**
 *
 * @author xnemet
 */
@Service
public class StudentServiceImpl implements StudentService {
    
    
    @Inject
    private StudentDao studentDao;

    @Override
    public String getNazev(Student student) {
        return student.getNazev();
    }
    
   
    @Override
    public void delete(Student student) {
        studentDao.delete(student);
    }

    @Override
    public void create(Student student) {
        studentDao.save(student);
    }

    @Inject
    public void update(Student student, String newName) {
        student.setName(newName);
        studentDao.save(student);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();}

    @Override
    public void save(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
}
