package com.andpedroso.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.andpedroso.spring.entities.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Integer>{
}
