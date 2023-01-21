package com.example.proyectou2_nosql.repo;

import com.example.proyectou2_nosql.model.Vacunas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacunasRepo extends MongoRepository<Vacunas, String> {

}
