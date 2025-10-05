package com.generation.progettoripassopane.model.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class OutputPaneDto
{
    private UUID id;
    private int tempoCottura,temperaturaCottura;
    private double prezzoAlKg;
    private String tipoFarina,lievito;
}
