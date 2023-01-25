package com.ricardodev.crudmysql.services;


import com.ricardodev.crudmysql.domain.Persona;
import com.ricardodev.crudmysql.model.PersonaJPA;
import com.ricardodev.crudmysql.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository repository;

    public List<Persona> getAll() {

        List<Persona> result;

        List<PersonaJPA> personaJPAS = repository.findAll();

        result = personaJPAS.stream()
                .map(personaJPA -> new Persona(personaJPA.getId(),
                        personaJPA.getNombre(),
                        personaJPA.getApellido(),
                        personaJPA.getEdad()))
                .collect(Collectors.toList());
        return result;
    }

}
