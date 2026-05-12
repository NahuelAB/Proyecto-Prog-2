package edu.mundial.model.organizacion;

public class Pais {
    private String nombre;
    private String bandera;
    public Seleccion representa;
    public Sede pertenece;

    public Pais() {
        this.nombre = null;
        this.bandera = null;
    }

    public Pais(String nombre, String bandera) {
        this.nombre = nombre;
        this.bandera = bandera;
    }

    public Pais(String nombre, String bandera, Seleccion representa, Sede pertenece) {
        this.nombre = nombre;
        this.bandera = bandera;
        this.representa = representa;
        this.pertenece = pertenece;
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

    public Seleccion getRepresenta() {
        return representa;
    }
    public void setRepresenta(Seleccion representa) {
        this.representa = representa;
    }

    public Sede getPertenece() {
        return pertenece;
    }
    public void setPertenece(Sede pertenece) {
        this.pertenece = pertenece;
    }
}
