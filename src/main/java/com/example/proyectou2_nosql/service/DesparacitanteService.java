package com.example.proyectou2_nosql.service;

import com.example.proyectou2_nosql.model.Desparacitante;
import com.example.proyectou2_nosql.repo.DesparacitanteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesparacitanteService {
    @Autowired
    private DesparacitanteRepo desparacitanteRepo;

    public Desparacitante save(Desparacitante desparacitante){
        return desparacitanteRepo.save(desparacitante);
    }
    public List<Desparacitante> getAll(){
        return desparacitanteRepo.findAll();
    }
    public void deleteById(String id){
        desparacitanteRepo.deleteById(id);
    }
    public Desparacitante update(Desparacitante desparacitante) {
        return desparacitanteRepo.save(desparacitante);
    }
}
