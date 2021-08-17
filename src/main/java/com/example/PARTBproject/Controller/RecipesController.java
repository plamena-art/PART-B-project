package com.example.PARTBproject.Controller;

import com.example.PARTBproject.Entity.Nutritious;
import com.example.PARTBproject.Entity.Recipe;
import com.example.PARTBproject.Repositories.NutritiousRepository;
import com.example.PARTBproject.Repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class RecipesController {

    @Autowired
    RecipeRepository repository;

    @Autowired
    NutritiousRepository nutritionRepository;
    private Object nutritionInfo;

    @RequestMapping("/recipe/{id}")
    public String recipe(@PathVariable Long id, Model model) {
        model.addAttribute("recipe", repository.findOne(id));
        model.addAttribute("nutritionInfo" , nutritionRepository.findAll());
        return "recipe";
    }

    @RequestMapping(value="/recipes", method=RequestMethod.GET)
    public String recipesList(Model model) {
        model.addAttribute("recipes", repository.findAll());
        return "recipes";
    }

    @RequestMapping(value="recipes", method=RequestMethod.POST)
    public String recipesAdd(@RequestParam String methodSteps, @RequestParam String description, @RequestParam String ingredients, Model model) {
        Recipe newRecipe = new Recipe();
        newRecipe.setMethodSteps();
        new.Recipe.setDescription();
        new.Recipe.setMethodSteps();
        repository.save(new.Recipe);


        model.addAttribute("recipe", newRecipe);
        model.addAttribute("recipes", nutritionRepository.findAll());
        return "redirect:/recipe/" + newRecipe.getId();
    }

    @RequestMapping(value="/recipe/{id}/nutritionInfo", method=RequestMethod.POST)
    public String recipesAddNutritiouns(@PathVariable Long id, @RequestParam Long nutritiousId, Model model) {
        Nutritious nutritious = NutritiousRepository.findOne(nutritiousId);
        Recipe recipe = (Recipe) repository.findOne(id);






    }
}
