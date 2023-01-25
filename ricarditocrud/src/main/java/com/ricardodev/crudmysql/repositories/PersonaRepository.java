package com.ricardodev.crudmysql.repositories;

import com.ricardodev.crudmysql.model.PersonaJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaJPA, Integer> {
}
