package ru.malyarov.maxim.EntityManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.malyarov.maxim.EntityManager.dao.StreetsDAO;
import ru.malyarov.maxim.EntityManager.model.Street;

import java.util.List;

@RestController("/street")
public class StreetsController {

    private StreetsDAO streetsDAO;

    @Autowired
    public StreetsController(StreetsDAO streetsDAO) {
        this.streetsDAO = streetsDAO;
    }
    @GetMapping
    public List<Street> getAll() {
        return streetsDAO.getAll();
    }

    @PostMapping
    public void create(@RequestBody Street street) {
        streetsDAO.create(street);
    }
}
