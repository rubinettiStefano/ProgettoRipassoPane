package com.generation.progettoripassopane.services;

import com.generation.progettoripassopane.model.dtos.InputPaneDto;
import com.generation.progettoripassopane.model.dtos.OutputPaneDto;
import com.generation.progettoripassopane.model.entities.Pane;
import com.generation.progettoripassopane.model.repositories.PaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaneService
{
    @Autowired
    PaneRepository repo;

    public List<OutputPaneDto> readAsDtos()
    {
        return repo.findAll().stream().map(p -> convertToDto(p)).toList();
    }

    public List<OutputPaneDto> readPane00AsDtos()
    {
        return repo.trovaPerFarina("00").stream().map(p -> convertToDto(p)).toList();
    }

    public OutputPaneDto insert(InputPaneDto dto)
    {
        Pane p = convertToEntity(dto);

        p=repo.save(p);

        return convertToDto(p);
    }

    //metodi per conversione
    private OutputPaneDto convertToDto(Pane p)
    {
        OutputPaneDto res = new OutputPaneDto();
        res.setLievito(p.getLievito());
        res.setPrezzoAlKg(p.getPrezzoAlKg());
        res.setTipoFarina(p.getTipoFarina());
        res.setTempoCottura(p.getTempoCottura());
        res.setTemperaturaCottura(p.getTemperaturaCottura());
        res.setId(p.getId());

        return res;
    }

    private Pane convertToEntity(InputPaneDto dto)
    {
        Pane res = new Pane();
        res.setLievito(dto.getLievito());
        res.setPrezzoAlKg(dto.getPrezzoAlKg());
        res.setTipoFarina(dto.getTipoFarina());
        res.setTempoCottura(dto.getTempoCottura());
        res.setTemperaturaCottura(dto.getTemperaturaCottura());

        return res;
    }
}
