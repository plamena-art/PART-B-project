package com.example.PARTBproject.Repositories;

import com.example.PARTBproject.Entity.Nutritions;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NutritionRepository extends CrudRepository<Nutritions,Long> {

    public List<Nutritions> findBytotal(String total);
}
