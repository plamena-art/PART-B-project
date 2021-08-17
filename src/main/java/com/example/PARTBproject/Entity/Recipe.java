package com.example.PARTBproject.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Id;
    private String description;
    private String ingredients;
    private String methodSteps;

    @ManyToMany
    private List<Nutritions> nutritionInfo;

    public Recipe() {
        super();
    }

    public Recipe(String description, String ingredients, String methodSteps, List<Nutritions> nutritionInfo) {
        this.description = description;
        this.ingredients = ingredients;
        this.methodSteps = methodSteps;
        this.nutritionInfo = nutritionInfo;
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

    public List<Nutritions> getNutritionInfo() {
        return nutritionInfo;
    }

    public void setNutritionInfo(List<Nutritions> nutritionInfo) {
        this.nutritionInfo = nutritionInfo;
    }

    public boolean hasNutritions(Nutritions Nutritions) {
        for (Nutritions containedNutritions: getNutritionInfo()) {
            if (containedNutritions.getId()) == Nutritions.getId()) {
    return true;
            }
        } return false;

    }
}
