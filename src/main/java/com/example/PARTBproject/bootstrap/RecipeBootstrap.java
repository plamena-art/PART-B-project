package com.example.PARTBproject.bootstrap;

import com.example.PARTBproject.Entity.Recipe;
import com.example.PARTBproject.Repositories.CategoryRepository;
import com.example.PARTBproject.Repositories.RecipeRepository;
import com.example.PARTBproject.Repositories.UnitsRepository;
import com.sun.org.slf4j.internal.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import sun.security.jgss.GSSToken;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

public class RecipeBootstrap implements ApplicationListener {

    private final CategoryRepository categoryRepository;
    private final RecipeRepository recipeRepository;
    private final UnitsRepository unitsRepository;

    public RecipeBootstrap(CategoryRepository categoryRepository, RecipeRepository recipeRepository, UnitsRepository unitsRepository) {
        this.categoryRepository = categoryRepository;
        this.recipeRepository = recipeRepository;
        this.unitsRepository = unitsRepository;
    }

    @Override
    @Transactional
    public void AppEvent(ContextRefreshedEvent event) {
        recipeRepository.saveAll(getRecipes());
        Logger log = null;
        log.debug("Loading Bootstrap Data");
    }

    private List<Recipe> getRecipes() {
        List<Recipe> recipes = new ArrayList<>(2)
    }

    //Optional - units of measure
    //get Units of measure
    //get optionals- each unit, table spoon inut, tea spoon unit, cups and etc
    //get categories - bulgarian, mexican and etc
    // recipes - bulgarian dish recipe,
    //add a return button ?

}
