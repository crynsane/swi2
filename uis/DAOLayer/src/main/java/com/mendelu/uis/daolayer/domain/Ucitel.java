package com.mendelu.uis.daolayer.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Roman Pechal
 */
@Entity
public class Ucitel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
@NotNull
    private String jmeno;
    
    @NotNull
    private String titul;
    
    @NotNull
    private String pracoviste;
    
    @NotNull
    private String email;    

    public Ucitel(int id, String jmeno, String titul, String pracoviste, String email) {
        this.id = id;
        this.jmeno = jmeno;
        this.titul = titul;
        this.pracoviste = pracoviste;
        this.email = email;
    }

    public Ucitel() {
    }

    public int getId() {
        return id;
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

    public String getPracoviste() {
        return pracoviste;
    }

    public void setPracoviste(String pracoviste) {
        this.pracoviste = pracoviste;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
    
    
}


