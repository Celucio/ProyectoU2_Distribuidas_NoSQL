package com.example.proyectou2_nosql.controller;

import com.example.proyectou2_nosql.model.Vitalidad;
import com.example.proyectou2_nosql.service.VitalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vitalidad")
public class VitalidadController {

    @Autowired
    private VitalidadService vitalidadService;

    @PostMapping(path = "/add")
    public Vitalidad createVitalidad(@RequestBody Vitalidad vitalidad){
        return vitalidadService.saveVitalidad(vitalidad);
    }
    @GetMapping(path = "/get")
    public List<Vitalidad> getAllVitalidad(){
        return vitalidadService.getAll();
    }
    @DeleteMapping(path = "/delete/{id}")
    public void deleteById(@RequestParam String id) {
        vitalidadService.deleteById(id);
    }
    @PutMapping(path = "/update")
    public Vitalidad updateVitalidad(@RequestBody Vitalidad vitalidad){
        return vitalidadService.update(vitalidad);
    }
}
