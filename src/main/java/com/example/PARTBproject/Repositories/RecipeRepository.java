package com.example.PARTBproject.Repositories;

import com.example.PARTBproject.Entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//public interface RecipeRepository extends CrudRepository<Recipe, Long> {
//    void saveAll(List<Recipe> recipes);

//}

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}