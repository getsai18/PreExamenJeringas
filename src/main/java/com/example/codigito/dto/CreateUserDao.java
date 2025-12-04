package com.example.codigito.dto;

import jakarta.validation.constraints.*;


public class CreateUserDao {
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    private String nombre;

    @NotBlank(message = "La edad es obligatoria")
    @Min(value = 18, message = "La edad debe ser al menos 18 años")
    @Max(value = 100, message = "La edad no puede ser mayor a 100 años")
    private Long edad;

    @NotBlank(message = "El genero no puede estar vacio")
    
}
