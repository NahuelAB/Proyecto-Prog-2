package edu.mundial.domain.persona;
import edu.mundial.domain.organizacion.Seleccion;

/**
 * Representa al responsable técnico de una selección nacional..
 */
public class DirectorTecnico extends Persona {
    private int fechaNombramiento;

    // Relación con Selección
    private Seleccion dirige;

    /**
     * Constructor por defecto.
     */
    public DirectorTecnico(){
        this("", 0, 0, null);
    }

    /**
     * Constructor completo para registrar un director técnico.
     * @param nombre Nombre completo, heredado de la clase Persona.
     * @param fecNacimiento Año de nacimiento, heredado de la clase Persona.
     * @param fechaNombramiento Año en el que fue designado para el cargo.
     * @param dirige Selección nacional a la cual lidera actualmente.
     */
    public DirectorTecnico(String nombre, int fecNacimiento, int fechaNombramiento, Seleccion dirige){
        super(nombre, fecNacimiento);
        this.fechaNombramiento = fechaNombramiento;
        this.dirige = dirige;
    }

    public int getFechaNombramiento() {
        return fechaNombramiento;
    }
    public void setFechaNombramiento(int fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    public Seleccion getDirige() {
        return dirige;
    }
    public void setDirige(Seleccion dirige) {
        this.dirige = dirige;
    }
}
