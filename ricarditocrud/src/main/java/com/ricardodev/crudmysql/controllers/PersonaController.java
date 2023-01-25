package com.ricardodev.crudmysql.controllers;

import com.ricardodev.crudmysql.domain.Persona;
import com.ricardodev.crudmysql.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService service;

    @GetMapping
    public ResponseEntity<List<Persona>> getPersonas(){
        return ResponseEntity.ok(service.getAll());
    }

     @PostMapping
    public ResponseEntity<String> savePersona(){
         return ResponseEntity.ok("Ejecutado metodo post");
    }

    @PutMapping
    public ResponseEntity<String> updatePersona(){
        return ResponseEntity.ok("Ejecutado metodo put");
    }

    @DeleteMapping
    public ResponseEntity<String> deletePersona(){
        return ResponseEntity.ok("Ejecutado metodo delete");
    }

}
