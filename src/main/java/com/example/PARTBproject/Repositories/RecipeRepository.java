package com.example.PARTBproject.Repositories;

import com.example.PARTBproject.Entity.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
