package com.mycompany.mavenproject3;

public class Ubicacion {
    private String ciudad;
    private String direccion;
    private String lugar;

    public Ubicacion(String ciudad, String direccion, String lugar) {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.lugar = lugar;
    }

    public String getCiudad() { return ciudad; }
    public String getDireccion() { return direccion; }
    public String getLugar() { return lugar; }
}
