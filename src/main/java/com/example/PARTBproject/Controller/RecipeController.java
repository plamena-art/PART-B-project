package com.example.PARTBproject.Controller;

import com.example.PARTBproject.Entity.Nutrition;
import com.example.PARTBproject.Entity.Recipe;
import com.example.PARTBproject.Repositories.NutritionRepository;
import com.example.PARTBproject.Repositories.RecipeRepository;
import com.example.PARTBproject.Services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @Autowired
    NutritionRepository nutritionRepository;
    private Object nutrition;

    @GetMapping("/")
    public String route(Model model) {
        model.addAttribute("recipes", recipeService.getAllRecipes());
        return "recipes";
    }

    @GetMapping("/create-recipe")
    public String createRecipe(Recipe recipe) {
        recipeService.save(recipe);
        //model.addAttribute("recipe", new Recipe());
        return "CreateRecipe";
    }

    @GetMapping("/recipe/{id}")
    public String recipe(@PathVariable Long id, Model model) {
        Recipe recipe = recipeService.getById(id);

        model.addAttribute("recipe", recipe);
        model.addAttribute("nutrition");
        return "recipe";
    }

    @GetMapping("/recipes")
    public String recipesList(Model model) {
        model.addAttribute("recipes", recipeService.getAllRecipes());
        return "recipe";
    }

    @PostMapping("/recipes")
    public String recipesAdd(@ModelAttribute("recipe") Recipe recipeData, Model model) {
        Recipe newRecipe = new Recipe();
        newRecipe.setMethodSteps(recipeData.getMethodSteps());
        newRecipe.setDescription(recipeData.getDescription());
        newRecipe.setIngredients(recipeData.getIngredients());
        newRecipe.setTotal(recipeData.getTotal());
        recipeService.save(newRecipe);


        //model.addAttribute("recipe", newRecipe);
        //model.addAttribute("recipes", nutritionRepository.findAll());
        //return "redirect:/recipes/" + newRecipe.getId();
        return "redirect:/";
    }

    @RequestMapping(value = "/recipe/{id}/nutrition", method = RequestMethod.POST)
    public String recipesAddNutrition(@PathVariable Long id, @RequestParam Long nutritionId, Model model) {
        Nutrition nutrition = nutritionRepository.findById(nutritionId).orElse(new Nutrition());
        Recipe recipe = recipeService.getById(id);

        if (recipe != null) {
            if (!recipe.hasNutrition(nutrition)) {
                recipe.getNutrition().add(nutrition);
            }
            recipeService.save(recipe);
            model.addAttribute("recipe", recipe);
            Model Nutrition = model.addAttribute("nutrition", recipe.getNutrition());
            return "redirect:/recipe" + recipe.getId();
        }

        model.addAttribute("recipes", recipeService.getAllRecipes());
        return "redirect:/recipes";

    }
}