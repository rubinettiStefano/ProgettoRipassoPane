package com.generation.progettoripassopane.model.repositories;

import com.generation.progettoripassopane.model.entities.Pane;
import com.generation.progettoripassopane.model.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PizzaRepository extends JpaRepository<Pizza, UUID> {
}
