package com.example.proyectou2_nosql.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString(exclude = {"id", "fecha_diagnostico"})
@Document(collection = "vitalidad")
public class Vitalidad {
    @Id
    private String id;
    private String presion;
    private String pulso_cardiaco;
    private String tipo_sangre;
    @CreatedDate
    private LocalDateTime fecha_diagnostico;
    private Veterinaria veterinaria;
    private List<Vacunas> vacunas;
    private Desparacitante desparacitante;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public String getPulso_cardiaco() {
        return pulso_cardiaco;
    }

    public void setPulso_cardiaco(String pulso_cardiaco) {
        this.pulso_cardiaco = pulso_cardiaco;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public LocalDateTime getFecha_diagnostico() {
        return fecha_diagnostico;
    }

    public void setFecha_diagnostico(LocalDateTime fecha_diagnostico) {
        this.fecha_diagnostico = fecha_diagnostico;
    }

    public Veterinaria getVeterinaria() {
        return veterinaria;
    }

    public void setVeterinaria(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    public List<Vacunas> getVacunas() {
        return vacunas;
    }

    public void setVacunas(List<Vacunas> vacunas) {
        this.vacunas = vacunas;
    }

    public Desparacitante getDesparacitante() {
        return desparacitante;
    }

    public void setDesparacitante(Desparacitante desparacitante) {
        this.desparacitante = desparacitante;
    }
}
