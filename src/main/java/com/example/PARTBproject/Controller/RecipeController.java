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
    private Object nutrition;

    @GetMapping("/")
    public String route(Model model) {
        model.addAttribute("recipes", recipeRepository.findAll());
        return "recipes";
    }

    @GetMapping("/create-recipe")
    public String createRecipe(Recipe recipe) {
        recipeRepository.save(recipe);
        //model.addAttribute("recipe", new Recipe());
        return "CreateRecipe";
    }

    @GetMapping("/recipe/{id}")
    public String recipe(@PathVariable Long id, Model model) {
        Recipe recipe = recipeRepository.findById(id).orElse(new Recipe());

        model.addAttribute("recipe", recipe);
        model.addAttribute("nutrition");
        return "recipe";
    }

    @GetMapping("/recipes")
    public String recipesList(Model model) {
        model.addAttribute("recipes", recipeRepository.findAll());
        return "recipe";
    }

    @PostMapping("/recipes")
    public String recipesAdd(@RequestParam String methodSteps, @RequestParam String description, @RequestParam String ingredients,@RequestParam String total, Model model) {
        Recipe newRecipe = new Recipe();
        newRecipe.setMethodSteps(methodSteps);
        newRecipe.setDescription(description);
        newRecipe.setIngredients(ingredients);
        newRecipe.setTotal(total);
        recipeRepository.save(newRecipe);


        //model.addAttribute("recipe", newRecipe);
        //model.addAttribute("recipes", nutritionRepository.findAll());
        //return "redirect:/recipes/" + newRecipe.getId();
        return "redirect:/";
    }

    @RequestMapping(value = "/recipe/{id}/nutrition", method = RequestMethod.POST)
    public String recipesAddNutrition(@PathVariable Long id, @RequestParam Long nutritionId, Model model) {
        Nutrition nutrition = nutritionRepository.findById(nutritionId).orElse(new Nutrition());
        Recipe recipe = recipeRepository.findById(id).orElse(new Recipe());

        if (recipe != null) {
            if (!recipe.hasNutrition(nutrition)) {
                recipe.getNutrition().add(nutrition);
            }
            recipeRepository.save(recipe);
            model.addAttribute("recipe", recipe);
            Model Nutrition = model.addAttribute("nutrition", recipe.getNutrition());
            return "redirect:/recipe" + recipe.getId();
        }

        model.addAttribute("recipes", recipeRepository.findAll());
        return "redirect:/recipes";

    }
}