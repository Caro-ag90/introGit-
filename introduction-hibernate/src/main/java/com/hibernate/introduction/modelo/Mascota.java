package com.hibernate.introduction.modelo;

public class Mascota {
    private int id;
    private String nombre;
    private String apellido;
    private String raza;
    private String foto;
    private String observacion;

    public Mascota(String nombre, String apellido, String raza, String foto, String observacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.raza = raza;
        this.foto = foto;
        this.observacion = observacion;
    }

    public Mascota(){

    }
    
    
    
}
