package com.example.PARTBproject.Entity;

//autogenerate the Java bytecode as per the annotations
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@Setter
@Entity
public class Units {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
}
