package com.example.codigito.dto;

import jakarta.validation.constraints.*;


public class CreateUserDao {
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    private String nombre;

    @NotBlank(message = "La edad es obligatoria")
    @Min(value = 18, message = "La edad debe ser al menos 18 años")
    @Max(value = 100, message = "La edad no puede ser mayor a 100 años")
    private int edad;

    @NotBlank(message = "El genero no puede estar vacio")
    private String genero;


    public CreateUserDao(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public CreateUserDao() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
}
