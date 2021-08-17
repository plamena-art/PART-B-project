package com.example.PARTBproject.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private String ingredients;
    private String methodSteps;

    @OneToMany
    private List<Nutrition> nutritionInfo;

    public Recipe() {
        super();
        this.nutritionInfo = new ArrayList<>();
    }

    public Recipe(String description, String ingredients, String methodSteps, List<Nutrition> nutritionInfo) {
        this.description = description;
        this.ingredients = ingredients;
        this.methodSteps = methodSteps;
        this.nutritionInfo = nutritionInfo;
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

    public List<Nutrition> getNutritionInfo() {
        return nutritionInfo;
    }

    public void setNutritionInfo(List<Nutrition> nutritionInfo) {
        this.nutritionInfo = nutritionInfo;
    }

    public boolean hasNutrition(Nutrition nutrition) {

        return getNutritionInfo().contains(nutrition);
    }

}
