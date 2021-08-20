package com.example.PARTBproject.Entity;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "description", length = 2000)
    private String description;
    @Column(name = "ingredients", length = 2000)
    private String ingredients;
    @Column(name = "methodSteps", length = 2000)
    private String methodSteps;
    @Column
    private String total;

    @OneToMany
    private List<Nutrition> nutrition;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Recipe() {
        super();
        this.nutrition = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getMethodSteps() {
        return methodSteps;
    }

    public void setMethodSteps(String methodSteps) {
        this.methodSteps = methodSteps;
    }

    public List<Nutrition> getNutrition() {
        return nutrition;
    }

    public void setNutrition(List<Nutrition> nutrition) {
        this.nutrition = nutrition;
    }

    public boolean hasNutrition(Nutrition nutrition) {

        return getNutrition().contains(nutrition);
    }

}

