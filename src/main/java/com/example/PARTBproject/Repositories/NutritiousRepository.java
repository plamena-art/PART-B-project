package com.example.PARTBproject.Repositories;

import com.example.PARTBproject.Entity.Nutritious;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NutritiousRepository extends CrudRepository<Nutritious,Long> {

    static Nutritious findOne(Long nutritiousId) {
    }

    public List<Nutritious> findBytotal(String total);
}
