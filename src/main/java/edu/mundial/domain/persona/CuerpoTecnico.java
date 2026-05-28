package edu.mundial.domain.persona;
import edu.mundial.enums.Rol;
import edu.mundial.domain.organizacion.Seleccion;

/**
 * Representa a los integrantes del equipo de apoyo de una selección (médicos, asistentes, etc.).
 */
public class CuerpoTecnico extends Persona {
    private Rol rol;

    // Relación con Selección
    private Seleccion seleccion;

    /**
     * Constructor por defecto.
     */
    public CuerpoTecnico(){
        this("", 0, null, null);
    }

    /**
     * Constructor completo para registrar un miembro del cuerpo técnico.
     * @param nombre Nombre completo, heredado de la clase Persona.
     * @param fecNacimiento Año de nacimiento, heredado de la clase Persona.
     * @param rol Función específica (ej. Médico, Kinesiólogo) definida en el enumerador Rol.
     * @param seleccion Selección nacional a la que asiste este profesional.
     */
    public CuerpoTecnico(String nombre, int fecNacimiento, Rol rol,  Seleccion seleccion){
        super(nombre, fecNacimiento);
        this.rol = rol;
        this.seleccion = seleccion;
    }
    public Rol getRol() {
        return rol;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }
    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }
}
