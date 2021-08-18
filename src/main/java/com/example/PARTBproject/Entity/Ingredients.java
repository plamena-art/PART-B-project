package com.example.PARTBproject.Entity;

import javax.persistence.*;
import java.math.BigDecimal;

public class Ingredients {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;

    //random precision integer unscaled value and a 32 bit integer scale. < or = to 0, cannot use double
    private BigDecimal amount;


    @OneToOne(fetch = FetchType.EAGER)
    private Units uom;

    @ManyToMany
    private Recipe recipe;

    public Ingredients() {
    }

    public Ingredients(String description, BigDecimal amount, Units uom, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.recipe = recipe;
    }
}
