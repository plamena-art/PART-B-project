package com.example.PARTBproject.Services;

import com.example.PARTBproject.Entity.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface RecipeService {

    List<Recipe> getRecipe();

}
