package com.example.PARTBproject;

import com.example.PARTBproject.Repositories.NutritiousRepository;
import com.example.PARTBproject.Repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PartBprojectApplication implements CommandLineRunner {

	@Autowired
	RecipeRepository repository;

	@Autowired
	NutritiousRepository nutritionRepository;

	public static void main(String[] args) {
		SpringApplication.run(PartBprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
