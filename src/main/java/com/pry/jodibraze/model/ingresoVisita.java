
package com.pry.jodibraze.model;

public class ingresoVisita 
{
    private int id;
    private String nombre;
    private String asunto;

    public ingresoVisita(int id, String nombre, String asunto) {
        this.id = id;
        this.nombre = nombre;
        this.asunto = asunto;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    } 
}
