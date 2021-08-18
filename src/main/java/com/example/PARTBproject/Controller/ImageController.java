package com.example.PARTBproject.Controller;

import com.example.PARTBproject.Services.RecipeService;

public class ImageController {

//creating image and recipe controller
    private final ImageController imageService;
    private final RecipeService recipeService;


//constructor
    public ImageController(ImageController imageService, RecipeService recipeService) {
        this.imageService = imageService;
        this.recipeService = recipeService;
    }


}
