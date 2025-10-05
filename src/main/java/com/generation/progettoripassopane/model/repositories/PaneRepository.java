package com.generation.progettoripassopane.model.repositories;

import com.generation.progettoripassopane.model.entities.Pane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface PaneRepository extends JpaRepository<Pane, UUID>
{
    List<Pane> findAllByLievito(String lievito);

    @Query("select p FROM Pane p WHERE p.tipoFarina = :farina")
    List<Pane> trovaPerFarina(String farina);
}
