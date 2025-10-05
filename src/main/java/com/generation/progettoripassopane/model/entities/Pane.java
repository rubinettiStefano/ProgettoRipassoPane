package com.generation.progettoripassopane.model.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pane extends ProdottoDaForno
{
    private String tipoFarina,lievito;

}
