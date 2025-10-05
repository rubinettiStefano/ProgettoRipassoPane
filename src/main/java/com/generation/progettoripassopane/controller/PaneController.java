package com.generation.progettoripassopane.controller;

import com.generation.progettoripassopane.model.dtos.InputPaneDto;
import com.generation.progettoripassopane.model.dtos.OutputPaneDto;
import com.generation.progettoripassopane.services.PaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pane")
public class PaneController
{
    @Autowired
    PaneService serv;

    @GetMapping
    public List<OutputPaneDto> getAll()
    {
        return serv.readAsDtos();
    }

    @PostMapping
    public OutputPaneDto insert(@RequestBody InputPaneDto dto)
    {
        return serv.insert(dto);
    }
}
