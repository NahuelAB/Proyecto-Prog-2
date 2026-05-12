package edu.mundial.model.personas;

/**
 * Clase abstracta que representa la base de cualquier individuo dentro del sistema.
 * Contiene la información personal mínima compartida por jugadores, árbitros y técnicos.
 */

public abstract class Persona {
    private String nombre;
    private int fecNacimiento;

    /**
     * Constructor por defecto de Persona.
     */
    public Persona(){
        this.nombre="";
        this.fecNacimiento=0;
    }
    /**
     * Constructor con parámetros.
     * @param nombre Nombre completo de la persona.
     * @param fecNacimiento Año de nacimiento (ej. 1995).
     */
    public Persona(String nombre, int fecNacimiento){
        this.nombre=nombre;
        this.fecNacimiento=fecNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFecNacimiento() {
        return fecNacimiento;
    }

    public void setFecNacimiento(int fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }
}
