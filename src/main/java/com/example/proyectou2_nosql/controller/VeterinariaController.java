package com.example.proyectou2_nosql.controller;


import com.example.proyectou2_nosql.model.Veterinaria;
import com.example.proyectou2_nosql.service.VeterinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("veterinaria")
public class VeterinariaController {
    @Autowired
    private VeterinariaService veterinariaService;

    @PostMapping(path = "/add")
    public Veterinaria createDesparacitante(@RequestBody Veterinaria veterinaria){
        return veterinariaService.save(veterinaria);
    }
    @GetMapping(path = "/get")
    public List<Veterinaria> getAll(){
        return veterinariaService.getAll();
    }
    @DeleteMapping(path = "/delete")
    public void deleteById(@RequestParam String id) {
        veterinariaService.deleteById(id);
    }
    @PutMapping(path = "/update")
    public Veterinaria update(@RequestBody Veterinaria veterinaria){
        return veterinariaService.update(veterinaria);
    }
}
