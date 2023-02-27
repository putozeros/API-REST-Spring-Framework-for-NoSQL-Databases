package com.apimongodb.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "usuarios")
@Data
public class Usuario {

    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

}
