package edu.mundial.domain.persona;
import edu.mundial.domain.organizacion.Seleccion;

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
