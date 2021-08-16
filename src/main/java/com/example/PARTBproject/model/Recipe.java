package com.example.PARTBproject.model;

import java.util.List;

public class Recipe {
    int ID;
    String description;
    java.util.List<String> ingredients;
    List<String> methodSteps;
    String nutritionInfo;
    private Object String;
    private Object List;

    public Recipe(int ID, java.lang.String description, java.util.List<java.lang.String> ingredients, java.util.List<java.lang.String> methodSteps, java.lang.String nutritionInfo, Object string, Object list) {
        this.ID = ID;
        this.description = description;
        this.ingredients = ingredients;
        this.methodSteps = methodSteps;
        this.nutritionInfo = nutritionInfo;
        String = string;
        List = list;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public java.lang.String getDescription() {
        return description;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public java.util.List<java.lang.String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(java.util.List<java.lang.String> ingredients) {
        this.ingredients = ingredients;
    }

    public java.util.List<java.lang.String> getMethodSteps() {
        return methodSteps;
    }

    public void setMethodSteps(java.util.List<java.lang.String> methodSteps) {
        this.methodSteps = methodSteps;
    }

    public java.lang.String getNutritionInfo() {
        return nutritionInfo;
    }

    public void setNutritionInfo(java.lang.String nutritionInfo) {
        this.nutritionInfo = nutritionInfo;
    }

    public Object getString() {
        return String;
    }

    public void setString(Object string) {
        String = string;
    }

    public Object getList() {
        return List;
    }

    public void setList(Object list) {
        List = list;
    }
}
