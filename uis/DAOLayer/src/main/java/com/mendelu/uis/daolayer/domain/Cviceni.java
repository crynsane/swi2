/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.daolayer.domain;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Stofa
 */
@Entity
public class Cviceni {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    private String ucebna;
    
    @NotNull
    private int kapacita;
    
    @NotNull
    @OneToOne(cascade = CascadeType.PERSIST)
    private Ucitel cvicici;
    
    @NotNull
    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<Student> studenti = new HashSet<>();
    
    @NotNull
    private Timestamp zacatek;
    
    
   @NotNull
    private Timestamp konec;
   
   @NotNull
   @ManyToOne(cascade = CascadeType.PERSIST)
    private Predmet predmet;

    public Cviceni(String ucebna, int kapacita, Ucitel cvicici, Timestamp zacatek, Timestamp konec, Predmet predmet) {
        this.ucebna = ucebna;
        this.kapacita = kapacita;
        this.cvicici = cvicici;
        
        this.zacatek = zacatek;
        this.konec = konec;
        this.predmet = predmet;
    }

    public Cviceni() {
    }

    public int getId() {
        return id;
    }

    public String getUcebna() {
        return ucebna;
    }

    public void setUcebna(String ucebna) {
        this.ucebna = ucebna;
    }

    public int getKapacita() {
        return kapacita;
    }

    public void setKapacita(int kapacita) {
        this.kapacita = kapacita;
    }

    public Ucitel getCvicici() {
        return cvicici;
    }

    public void setCvicici(Ucitel cvicici) {
        this.cvicici = cvicici;
    }

    public Set<Student> getStudenti() {
        return Collections.unmodifiableSet(studenti);
    }

    public void addStudent(Student student) {
        if (student != null) {
            this.studenti.add(student);
        }
    }

    public void addStudent(Collection<Student> student) {
        if (student != null) {
            this.studenti.addAll(student);
        }
    }

    public Timestamp getZacatek() {
        return zacatek;
    }

    public void setZacatek(Timestamp zacatek) {
        this.zacatek = zacatek;
    }

    public Timestamp getKonec() {
        return konec;
    }

    public void setKonec(Timestamp konec) {
        this.konec = konec;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }
   
   
}
