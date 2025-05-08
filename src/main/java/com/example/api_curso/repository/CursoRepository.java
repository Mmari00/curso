package com.example.api_curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_curso.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    
}
