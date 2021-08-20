package com.example.PARTBproject;

import com.example.PARTBproject.Controller.RecipeController;
import com.example.PARTBproject.Entity.Recipe;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

@SpringBootTest
class PartBprojectApplicationTests {


	@Autowired
	private RecipeController recipeController;

	@Test
	public void recipe() {
//		 = new Recipe();
//		recipeController.recipesAdd(Model model);
	}

}
