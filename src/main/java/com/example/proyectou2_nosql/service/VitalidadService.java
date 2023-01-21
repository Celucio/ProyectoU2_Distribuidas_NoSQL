package com.example.proyectou2_nosql.service;

import com.example.proyectou2_nosql.model.Vitalidad;
import com.example.proyectou2_nosql.repo.VitalidadRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VitalidadService {

    @Autowired
    private VitalidadRepo vitalidadRepo;

    public Vitalidad saveVitalidad(Vitalidad vitalidad){
        return vitalidadRepo.save(vitalidad);
    }
    public List<Vitalidad> getAll(){
        return vitalidadRepo.findAll();
    }
    public void deleteById(String id){
        if (id == null) {
            throw new IllegalArgumentException("id must not be null");
        }
        Optional<Vitalidad> vitalidadOpt = vitalidadRepo.findById(id);
        if (!vitalidadOpt.isPresent()) {
            throw new RuntimeException("Not Found");
        }
        vitalidadRepo.deleteById(id);;
    }
    public Vitalidad update(Vitalidad vitalidad) {
        return vitalidadRepo.save(vitalidad);
    }
}
