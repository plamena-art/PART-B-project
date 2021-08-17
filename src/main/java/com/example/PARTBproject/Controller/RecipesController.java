package com.example.PARTBproject.Controller;

import com.example.PARTBproject.Entity.Nutritions;
import com.example.PARTBproject.Repositories.NutritionRepository;
import com.example.PARTBproject.Repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class RecipesController {

    @Autowired
    RecipeRepository repository;

    @Autowired
    NutritionRepository nutritionRepository;
    private Object nutritionInfo;

    @RequestMapping("/recipe/{id}")
    public String recipe(@PathVariable Long id, Model model) {
        model.addAttribute("recipe", repository.findOne(id));
        model.addAttribute("nutritionInfo" , nutritionRepository.findAll());
        return "recipe";
    }

    @RequestMapping()
}
