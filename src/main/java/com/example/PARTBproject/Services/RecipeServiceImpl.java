package com.example.PARTBproject.Services;

import com.example.PARTBproject.Commands.RecipeCommandToRecipe;
import com.example.PARTBproject.Commands.RecipeToRecipeCommand;
import com.example.PARTBproject.Entity.Recipe;
import com.example.PARTBproject.Repositories.RecipeRepository;

import java.util.Set;

public class RecipeServiceImpl implements RecipeService {

    private RecipeRepository recipeRepository;
    private RecipeCommandToRecipe recipeCommandToRecipe;
    private RecipeToRecipeCommand recipeToRecipeCommand;


    @Override
    public Set<Recipe> getRecipe() {
        return null;
    }
}
