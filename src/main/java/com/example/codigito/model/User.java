package com.example.codigito.model;

public class User {
    private Long id;
    private String nombre;
    private int edad;
    private String genero;


    public User() {
    }

    public User(Long id, String nombre, int edad, String genero){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id =  id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre  = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
}
