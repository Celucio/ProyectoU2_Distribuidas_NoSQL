package com.example.proyectou2_nosql.service;

import com.example.proyectou2_nosql.model.Vacunas;
import com.example.proyectou2_nosql.model.Veterinaria;
import com.example.proyectou2_nosql.repo.VacunasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacunaService {
    @Autowired
    private VacunasRepo vacunasRepo;

    public Vacunas save(Vacunas vacunas){
        return vacunasRepo.save(vacunas);
    }
    public List<Vacunas> getAll(){
        return vacunasRepo.findAll();
    }
    public void deleteById(String id){
        vacunasRepo.deleteById(id);
    }
    public Vacunas update(Vacunas vacunas) {
        return vacunasRepo.save(vacunas);
    }


}
