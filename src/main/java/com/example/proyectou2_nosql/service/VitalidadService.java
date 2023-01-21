package com.example.proyectou2_nosql.service;

import com.example.proyectou2_nosql.model.Vitalidad;
import com.example.proyectou2_nosql.repo.VitalidadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        vitalidadRepo.deleteById(id);
    }
    public Vitalidad update(Vitalidad vitalidad) {
        return vitalidadRepo.save(vitalidad);
    }
}
