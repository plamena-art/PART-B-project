package com.example.PARTBproject.Services;

import com.example.PARTBproject.Entity.Recipe;
import com.example.PARTBproject.Repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public List<Recipe> getRecipe() {
        return (List<Recipe>) recipeRepository.findAll();
    }

}


