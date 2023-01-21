package com.example.proyectou2_nosql.service;


import com.example.proyectou2_nosql.model.Veterinaria;
import com.example.proyectou2_nosql.repo.VeterinariaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinariaService {

    @Autowired
    private VeterinariaRepo veterinariaRepo;

    public Veterinaria save(Veterinaria veterinaria){
        return veterinariaRepo.save(veterinaria);
    }
    public List<Veterinaria> getAll(){
        return veterinariaRepo.findAll();
    }
    public void deleteById(String id){
        veterinariaRepo.deleteById(id);
    }
    public Veterinaria update(Veterinaria veterinaria) {
        return veterinariaRepo.save(veterinaria);
    }
}
