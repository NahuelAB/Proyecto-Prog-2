package edu.mundial.model.organizacion;

public class Pais {
    private String nombre;
    private String bandera;

    public Pais() {
        this.nombre = null;
        this.bandera = null;
    }

    public Pais(String nombre, String bandera) {
        this.nombre = nombre;
        this.bandera = bandera;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBandera() {
        return bandera;
    }
    public void setBandera(String bandera) {
        this.bandera = bandera;
    }
}
