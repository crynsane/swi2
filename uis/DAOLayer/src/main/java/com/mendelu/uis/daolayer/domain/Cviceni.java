/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.daolayer.domain;

import java.sql.Timestamp;
import java.util.ArrayList;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Stofa
 */
public class Cviceni {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    private String ucebna;
    
    @NotNull
    private int kapacita;
    
    @NotNull
    private Ucitel cvicici;
    
    @NotNull
    private ArrayList<Student> studenti;
    
    @NotNull
    private Timestamp zacatek;
    
    
   @NotNull
    private Timestamp konec;
   
   @NotNull
    private Predmet predmet;

    public Cviceni(int id, String ucebna, int kapacita, Ucitel cvicici, ArrayList<Student> studenti, Timestamp zacatek, Timestamp konec, Predmet predmet) {
        this.id = id;
        this.ucebna = ucebna;
        this.kapacita = kapacita;
        this.cvicici = cvicici;
        this.studenti = studenti;
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

    public ArrayList<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<Student> studenti) {
        this.studenti = studenti;
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
