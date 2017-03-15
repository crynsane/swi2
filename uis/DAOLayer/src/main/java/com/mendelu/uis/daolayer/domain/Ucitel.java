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
}
