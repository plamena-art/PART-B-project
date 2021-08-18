package com.example.PARTBproject.Repositories;

import com.example.PARTBproject.Entity.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

    //Optional<Recipe> findById(Long recipeId)

}
