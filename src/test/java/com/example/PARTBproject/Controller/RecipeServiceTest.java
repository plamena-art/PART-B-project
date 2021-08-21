package com.example.PARTBproject.Controller;

import com.example.PARTBproject.Entity.Recipe;
import com.example.PARTBproject.Repositories.RecipeRepository;
import com.example.PARTBproject.Services.RecipeService;
import com.example.PARTBproject.Services.RecipeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class RecipeServiceTest {

    @Autowired
    private RecipeService recipeService;

//testing on recipe service new recipe
    @Test
    void save() {
        Recipe newRecipe = new Recipe();
        newRecipe.setMethodSteps("step1");
        newRecipe.setDescription("des1");
        newRecipe.setIngredients("ingre1");
        newRecipe.setTotal("total1");
        Recipe recipe = recipeService.save(newRecipe);
        assertNotNull(recipe);
    }

//testing on get by id
    @Test
    void getById() {
        Long id = 1L;
       Recipe recipe = recipeService.getById(id);
       assertNotNull(recipe);
    }

//testing on get all recipes
    @Test
    void getAllRecipes() {

        List<Recipe> recipeResponseList = recipeService.getAllRecipes();
        assertNotNull(recipeResponseList);
    }
}