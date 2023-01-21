package com.example.proyectou2_nosql.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document
public class Veterinaria {

    private String nombre_veterinaria;
    private String email_veterinaria;
    private String telefono_veterinaria;

}
