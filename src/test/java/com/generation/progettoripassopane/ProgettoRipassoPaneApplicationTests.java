package com.generation.progettoripassopane;

import com.generation.progettoripassopane.model.dtos.OutputPaneDto;
import com.generation.progettoripassopane.model.entities.Pane;
import com.generation.progettoripassopane.model.entities.Pizza;
import com.generation.progettoripassopane.model.repositories.PaneRepository;
import com.generation.progettoripassopane.model.repositories.PizzaRepository;
import com.generation.progettoripassopane.services.PaneService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
class ProgettoRipassoPaneApplicationTests
{

    @Autowired
    PaneService serv;

    @Test
    void contextLoads()
    {
        List<OutputPaneDto> res = serv.readAsDtos();
        assertEquals(1,res.size(),"Numero oggetti sbagliato");

        OutputPaneDto paneLetto = res.get(0);
        assertEquals("Di Birra",paneLetto.getLievito(),"Lievito sbagliato");
        assertEquals(40,paneLetto.getTempoCottura(),"Tempo Cottura sbagliato");
        assertEquals(180,paneLetto.getTemperaturaCottura(),"Temperatura sbagliato");
        assertEquals(12.99,paneLetto.getPrezzoAlKg(),"Prezzo sbagliato");
        assertEquals("00",paneLetto.getTipoFarina(),"Farina sbagliato");
    }




    @Autowired
    PaneRepository repo;
    @Autowired
    PizzaRepository pRepo;
    @BeforeEach
    void refreshDb()
    {
        repo.deleteAll();
        pRepo.deleteAll();
        Pane p = new Pane();
        p.setLievito("Di Birra");
        p.setTempoCottura(40);
        p.setTemperaturaCottura(180);
        p.setTipoFarina("00");
        p.setPrezzoAlKg(12.99);

        repo.save(p);
        Pizza p2 = new Pizza();
        p2.setCondimento("Prosciutto e ananas");
        p2.setSenzaLattosio(false);
        p2.setTempoCottura(3);
        p2.setTemperaturaCottura(450);
        p2.setPrezzoAlKg(0.01);

        pRepo.save(p2);
    }

}
