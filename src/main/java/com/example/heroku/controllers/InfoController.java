
package com.example.heroku.controllers;

import com.example.heroku.entities.Persona;
import com.example.heroku.repositories.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    
    @Autowired
    private PersonaRepository repo;
    
    @GetMapping("/saludar")
    public String saluda(){
        return "Hola";
    }

    @GetMapping("/info")
    public List<Persona> obtenerPersonas(){
        return repo.findAll();
    }
}
