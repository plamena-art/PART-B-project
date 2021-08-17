package com.example.PARTBproject.Repositories;

import com.example.PARTBproject.Entity.Nutritious;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NutritionRepository extends CrudRepository<Nutritious,Long> {

    public List<Nutritious> findBytotal(String total);
}
