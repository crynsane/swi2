/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.daolayer.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Stofa
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    private String jmeno;
    
    @NotNull
    private String titul;
    
    @NotNull
    private int semestr;
    
    @NotNull
    private String email; 
    
    @NotNull
    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<Predmet> predmety = new HashSet<>();
    
    @NotNull
    private int ziskaneKredity;

    public Student(String jmeno, String titul, int semestr, String email, int ziskaneKredity) {
        this.jmeno = jmeno;
        this.titul = titul;
        this.semestr = semestr;
        this.email = email;
        
        this.ziskaneKredity = ziskaneKredity;
    }

    public int getId() {
        return id;
    }

    public Student() {
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getTitul() {
        return titul;
    }

    public void setTitul(String titul) {
        this.titul = titul;
    }

    public int getSemestr() {
        return semestr;
    }

    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   

    public Set<Predmet> getPredmet() {
        return Collections.unmodifiableSet(predmety);
    }

    public void addPredmet(Predmet predmet) {
        if (predmet != null) {
            this.predmety.add(predmet);
        }
    }

    public void addPredmet(Collection<Predmet> predmet) {
        if (predmet != null) {
            this.predmety.addAll(predmet);
        }
    }

    public int getZiskaneKredity() {
        return ziskaneKredity;
    }

    public void setZiskaneKredity(int ziskaneKredity) {
        this.ziskaneKredity = ziskaneKredity;
    }

    public void setName(String newName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNazev() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        
}
