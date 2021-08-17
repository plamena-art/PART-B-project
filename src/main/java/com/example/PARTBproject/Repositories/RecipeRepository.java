package com.example.PARTBproject.Repositories;

import com.example.PARTBproject.Entity.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
