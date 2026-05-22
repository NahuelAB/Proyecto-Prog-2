package edu.mundial.domain.organizacion;

public class Estadio {
    private String nombre;
    private int capacidad;
    public Sede tiene;

    public Estadio() {
        this.nombre = null;
        this.capacidad = 0;
        this.tiene = null;
    }

    public Estadio(String nombre, int capacidad, Sede tiene) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tiene = tiene;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Sede getTiene() {
        return tiene;
    }
    public void setTiene(Sede tiene) {
        this.tiene = tiene;
    }
}
