/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.servicelayer.service;

import com.mendelu.uis.daolayer.domain.Student;
import java.util.List;

/**
 *
 * @author Martin
 */
public interface StudentService {
   
    
    String getNazev(Student student);
    
        List<Student> findAll();

    void delete(Student student);

    void create(Student student);
    
    void save(Student student);

}