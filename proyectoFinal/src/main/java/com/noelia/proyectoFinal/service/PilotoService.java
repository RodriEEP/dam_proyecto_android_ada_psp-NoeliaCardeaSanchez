package com.noelia.proyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noelia.proyectoFinal.entitys.Piloto;
import com.noelia.proyectoFinal.repositories.PilotoRepository;

@Service
public class PilotoService {

    private final PilotoRepository pilotoRepository;

    @Autowired
    public PilotoService(PilotoRepository pilotoRepository) {
        this.pilotoRepository = pilotoRepository;
    }

    public List<Piloto> obtenerTodos() {
        return pilotoRepository.findAll();
    }

    public Optional<Piloto> obtenerPorId(Long id) {
        return pilotoRepository.findById(id);
    }

    public Piloto guardar(Piloto piloto) {
        return pilotoRepository.save(piloto);
    }

    public void eliminar(Long id) {
        pilotoRepository.deleteById(id);
    }
    
    public Piloto buscarPorNombre(String nombre) {
    	return pilotoRepository.findByNombre(nombre);
    }
}