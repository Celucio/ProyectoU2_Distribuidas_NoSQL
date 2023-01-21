package com.example.proyectou2_nosql.controller;

import com.example.proyectou2_nosql.model.Desparacitante;

import com.example.proyectou2_nosql.service.DesparacitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("desparacitante")
public class DesparacitanteController {

    @Autowired
    private DesparacitanteService desparacitanteService;

    @PostMapping(path = "/add")
    public Desparacitante createDesparacitante(@RequestBody Desparacitante desparacitante){
        return desparacitanteService.save(desparacitante);
    }
    @GetMapping(path = "/get")
    public List<Desparacitante> getAll(){
        return desparacitanteService.getAll();
    }
    @DeleteMapping(path = "/delete/{id}")
    public void deleteById(@RequestParam String id) {
        desparacitanteService.deleteById(id);
    }
    @PutMapping(path = "/update")
    public Desparacitante update(@RequestBody Desparacitante desparacitante){
        return desparacitanteService.update(desparacitante);
    }
}
