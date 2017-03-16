/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.daolayer.domain;

import java.sql.Timestamp;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Stofa
 */
public class Prednaska {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;   

 
    @NotNull
    private String ucebna;
    
    @NotNull
    private Ucitel ucitel;
    
    @NotNull
    private Predmet predmet;
    
     @NotNull
    private Timestamp zacatek;
    
    
   @NotNull
    private Timestamp konec;

    public Prednaska(int id, String ucebna, Ucitel ucitel, Predmet predmet, Timestamp zacatek, Timestamp konec) {
        this.id = id;
        this.ucebna = ucebna;
        this.ucitel = ucitel;
        this.predmet = predmet;
        this.zacatek = zacatek;
        this.konec = konec;
    }

    public Prednaska() {
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

    public Ucitel getUcitel() {
        return ucitel;
    }

    public void setUcitel(Ucitel ucitel) {
        this.ucitel = ucitel;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
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
   
   
    
}
