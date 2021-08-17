package com.example.PARTBproject.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long Id;
    private String description;
    private String ingredients;
    private String methodSteps;

    @ManyToMany
    private List<Nutritious> nutritionInfo;

    public Recipe() {
        super();
    }

    public Recipe(long Id, String description, String ingredients, String methodSteps, List<Nutritious> nutritionInfo) {
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

    public List<Nutritious> getNutritionInfo() {
        return nutritionInfo;
    }

    public void setNutritionInfo(List<Nutritious> nutritionInfo) {
        this.nutritionInfo = nutritionInfo;
    }

    public boolean hasNutritious(Nutritious nutritious) {
        for (Nutritious containedNutritious: getNutritionInfo()) {
            if (containedNutritious.getId() == nutritious.getId()) {
                continue;
            }
            return true;
        } return false;

    }

    public long getId() {
        return Id;
    }
}
