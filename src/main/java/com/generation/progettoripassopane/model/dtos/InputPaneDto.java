package com.generation.progettoripassopane.model.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InputPaneDto
{
    private int tempoCottura,temperaturaCottura;
    private double prezzoAlKg;
    private String tipoFarina,lievito;
}
