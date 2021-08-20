package com.example.PARTBproject.Services;

import com.example.PARTBproject.Entity.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;



public interface RecipeService {

    public Recipe save(Recipe recipe);

    public Recipe getById(Long id);

    public List<Recipe> getAllRecipes();

}
