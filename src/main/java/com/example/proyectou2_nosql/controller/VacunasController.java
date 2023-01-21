package com.example.proyectou2_nosql.controller;

import com.example.proyectou2_nosql.model.Vacunas;
import com.example.proyectou2_nosql.service.VacunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vacunas")
public class VacunasController {
    @Autowired
    private VacunaService vacunaService;
    @PostMapping(path = "/add")
    public Vacunas createVacunas(@RequestBody Vacunas vacunas){
        return vacunaService.save(vacunas);
    }
    @GetMapping(path = "/get")
    public List<Vacunas> getAllVacunas(){
        return vacunaService.getAll();
    }
    @DeleteMapping(path = "/delete/{id}")
    public void deleteById(@RequestParam String id) {
        vacunaService.deleteById(id);
    }
    @PutMapping(path = "/update")
    public Vacunas updateVitalidad(@RequestBody Vacunas vacunas){
        return vacunaService.update(vacunas);
    }
}
