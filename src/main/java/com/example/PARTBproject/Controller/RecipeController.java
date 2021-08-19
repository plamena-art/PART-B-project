package com.example.PARTBproject.Controller;

import com.example.PARTBproject.Entity.Nutrition;
import com.example.PARTBproject.Entity.Recipe;
import com.example.PARTBproject.Repositories.NutritionRepository;
import com.example.PARTBproject.Repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RecipeController {

    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    NutritionRepository nutritionRepository;
    private Object nutritionInfo;

    @GetMapping("/create-recipe")
    public String createRecipe(Model model) {
        model.addAttribute("recipe", new Recipe());
        return "CreateRecipe";
    }

    @GetMapping("/recipe/{id}")
    public String recipe(@PathVariable Long id, Model model) {
        Recipe recipe = recipeRepository.findById(id).orElse(new Recipe());

        model.addAttribute("recipe", recipe);
        model.addAttribute("nutritionInfo", recipe.getNutritionInfo());
        return "recipe";
    }

    @GetMapping("/recipes")
    public String recipesList(Model model) {
        model.addAttribute("recipes", recipeRepository.findAll());
        return "recipeList";
    }

    @PostMapping("/recipes")
    public String recipesAdd(@RequestParam String methodSteps, @RequestParam String description, @RequestParam String ingredients, Model model) {
        Recipe newRecipe = new Recipe();
        newRecipe.setMethodSteps(methodSteps);
        newRecipe.setDescription(description);
        newRecipe.setIngredients(ingredients);
        recipeRepository.save(newRecipe);


        model.addAttribute("recipe", newRecipe);
        model.addAttribute("recipes", nutritionRepository.findAll());
        return "redirect:/recipe/" + newRecipe.getId();
    }

    @RequestMapping(value = "/recipe/{id}/nutritionInfo", method = RequestMethod.POST)
    public String recipesAddNutritiouns(@PathVariable Long id, @RequestParam Long nutritiousId, Model model) {
        Nutrition nutrition = nutritionRepository.findById(nutritiousId).orElse(new Nutrition());
        Recipe recipe = recipeRepository.findById(id).orElse(new Recipe());

        if (recipe != null) {
            if (!recipe.hasNutrition(nutrition)) {
                recipe.getNutritionInfo().add(nutrition);
            }
            recipeRepository.save(recipe);
            model.addAttribute("recipe", recipe);
            Model nutritionInfo = model.addAttribute("nutritionInfo", recipe.getNutritionInfo());
            return "redirect:/recipe" + recipe.getId();
        }

        model.addAttribute("recipes", recipeRepository.findAll());
        return "redirect:/recipes";

    }
}