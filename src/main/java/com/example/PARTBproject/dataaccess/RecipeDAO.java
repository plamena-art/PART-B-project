package com.example.PARTBproject.dataaccess;

import java.util.List;

public interface RecipeDAO {

//CREATE A METHOD THAT WE WILL USE TO INSERT A NEW RECIPE TO THE INTERFACE
    String insertRecipe (int ID, String description, List<String> ingredients, List<String> methodSteps, String nutritionInfo);

}

