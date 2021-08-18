package com.example.PARTBproject.Entity;

import javax.persistence.*;

public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Recipe recipe;


    //Large Object refers to a variable lenght datatype for storing large objects
    @Lob
    private String recipeNotes;

}
