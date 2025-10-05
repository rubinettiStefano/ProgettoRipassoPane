package com.generation.progettoripassopane.model.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pizza extends ProdottoDaForno
{
    private String condimento;
    private boolean senzaLattosio;
}
