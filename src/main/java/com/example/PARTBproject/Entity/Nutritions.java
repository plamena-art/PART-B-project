package com.example.PARTBproject.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nutritions {
    //public boolean getId() {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long Id;
    private String description;
    private String total;

    public Nutritions() {
        super();
    }

    public Nutritions(String description, String total) {
        this.description = description;
        this.total = total;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public boolean getId() {
    }
}
