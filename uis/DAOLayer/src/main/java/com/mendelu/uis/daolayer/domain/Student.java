/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.daolayer.domain;

import java.util.ArrayList;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Stofa
 */
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
    private ArrayList<Predmet> predmety;
    
    @NotNull
    private int ziskaneKredity;

    public Student(String jmeno, String titul, int semestr, String email, ArrayList<Predmet> predmety, int ziskaneKredity) {
        this.jmeno = jmeno;
        this.titul = titul;
        this.semestr = semestr;
        this.email = email;
        this.predmety = predmety;
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

    public ArrayList<Predmet> getPredmety() {
        return predmety;
    }

    public void setPredmety(ArrayList<Predmet> predmety) {
        this.predmety = predmety;
    }

    public int getZiskaneKredity() {
        return ziskaneKredity;
    }

    public void setZiskaneKredity(int ziskaneKredity) {
        this.ziskaneKredity = ziskaneKredity;
    }
    
        
}
