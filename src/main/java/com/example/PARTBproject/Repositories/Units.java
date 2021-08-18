package com.example.PARTBproject.Repositories;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface Units extends CrudRepository<Units, Long> {

    Optional<Units> findByDescription(String description);
}
