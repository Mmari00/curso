package com.example.api_curso.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.api_curso.model.Curso;
import com.example.api_curso.repository.CursoRepository;

@Service
public class CursoService {

    private CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    public Curso findById(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }   

    public void delete(Long id){
        cursoRepository.deleteById(id);
    }

    public void deleteById(Long id) {
        cursoRepository.deleteById(id);
    }


}
