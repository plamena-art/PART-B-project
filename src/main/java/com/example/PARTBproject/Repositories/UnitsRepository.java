package com.example.PARTBproject.Repositories;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitsRepository extends CrudRepository<UnitsRepository, Long> {

    Optional<UnitsRepository> findByDescription(String description);
}
