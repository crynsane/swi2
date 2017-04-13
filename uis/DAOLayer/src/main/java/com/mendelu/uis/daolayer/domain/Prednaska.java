/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.daolayer.domain;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Stofa
 */
@Entity
public class Prednaska {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;   

 
    @NotNull
    private String ucebna;
    
    @NotNull
    @ManyToOne(cascade=CascadeType.PERSIST)
    private Ucitel ucitel;
    
    @NotNull
    @OneToOne
    @ManyToOne(cascade=CascadeType.PERSIST)
    private Predmet predmet;
    
     @NotNull
    private Date zacatek;
    
    
   @NotNull
    private Date konec;

    public Prednaska(String ucebna, Ucitel ucitel, Predmet predmet, Date zacatek, Date konec) {
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

    public Date getZacatek() {
        return zacatek;
    }

    public void setZacatek(Timestamp zacatek) {
        this.zacatek = zacatek;
    }

    public Date getKonec() {
        return konec;
    }

    public void setKonec(Timestamp konec) {
        this.konec = konec;
    }
   
   
    
}
