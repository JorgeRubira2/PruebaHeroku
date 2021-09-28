
package com.example.heroku.repositories;

import com.example.heroku.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface PersonaRepository extends JpaRepository<Persona, Integer>{
}
