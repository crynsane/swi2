package com.mendelu.uis.daolayer.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Roman Pechal
 */
@Entity
public class Predmet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    private String nazev;
    
    @NotNull
    private String kodPredmetu;
    
    @NotNull
    private int pocetKreditu;
    
    @NotNull
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="TRAINER_ID")
    private Ucitel ucitel;

    public Predmet(String kodPredmetu, String nazev, int pocetKreditu, Ucitel ucitel) {
        this.ucitel = ucitel;
        this.kodPredmetu = kodPredmetu;
        this.nazev = nazev;
        this.pocetKreditu = pocetKreditu;
    }
    
    protected Predmet() {
    }
    
    public int getId() {
        return id;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getKodPredmetu() {
        return kodPredmetu;
    }

    public void setKodPredmetu(String kodPredmetu) {
        this.kodPredmetu = kodPredmetu;
    }

    public int getPocetKreditu() {
        return pocetKreditu;
    }

    public void setPocetKreditu(int pocetKreditu) {
        this.pocetKreditu = pocetKreditu;
    }

    public Ucitel getUcitel() {
        return ucitel;
    }

    public void setUcitel(Ucitel ucitel) {
        this.ucitel = ucitel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predmet)) return false;
        return true;

    }

    @Override
    public int hashCode() {
        int result = getUcitel().hashCode();
        result = 31 * result + getUcitel().hashCode();
        return result;
    }

}
