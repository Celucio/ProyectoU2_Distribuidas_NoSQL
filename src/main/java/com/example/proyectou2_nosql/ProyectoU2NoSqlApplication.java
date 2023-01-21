package com.example.proyectou2_nosql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class ProyectoU2NoSqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProyectoU2NoSqlApplication.class, args);
    }

}
